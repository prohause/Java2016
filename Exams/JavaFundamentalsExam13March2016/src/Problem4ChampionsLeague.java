import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by proha on 16-Apr-16.
 */
public class Problem4ChampionsLeague {


    public static void main(String[] args) {
        class AllTeams {
            public int score;
            public String teamName;

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
                this.score = score;
            }

            public String getTeamName() {
                return teamName;
            }

            public void setTeamName(String teamName) {
                this.teamName = teamName;
            }
        }
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> info = new ArrayList<>();

        while (!input.equals("stop")) {
            info.add(input);
            input = scanner.nextLine();
        }

        List<AllTeams> ligue = new ArrayList<>();
        List<String> teams = new ArrayList<>();

        Pattern pattern = Pattern.compile("(\\D+\\s*?)\\s+\\|\\s+(\\D+\\s*?)\\s+\\|\\s+(\\d+):(\\d+)\\s\\|\\s(\\d+):(\\d+)");

        for (String s : info) {
            Matcher matcher = pattern.matcher(s);
            AllTeams currentTeam1 = new AllTeams();
            AllTeams currentTeam2 = new AllTeams();

            if (matcher.find()) {

                int team1 = Integer.parseInt(matcher.group(3)) + Integer.parseInt(matcher.group(6));
                int team2 = Integer.parseInt(matcher.group(4)) + Integer.parseInt(matcher.group(5));
                currentTeam1.setTeamName(matcher.group(1));
                if (!teams.contains(currentTeam1.getTeamName())){
                    teams.add(currentTeam1.getTeamName());
                }

                if (team1 > team2) {
                    currentTeam1.setScore(1);
                } else if (team1 == team2 && Integer.parseInt(matcher.group(6)) > Integer.parseInt(matcher.group(4))) {
                    currentTeam1.setScore(1);
                } else {
                    currentTeam1.setScore(0);
                }

                ligue.add(currentTeam1);

                currentTeam2.setTeamName(matcher.group(2));

                if (team2 > team1) {
                    currentTeam2.setScore(1);
                } else if (team2 == team1 && Integer.parseInt(matcher.group(4)) > Integer.parseInt(matcher.group(6))) {
                    currentTeam2.setScore(1);
                } else {
                    currentTeam2.setScore(0);
                }
                if (!teams.contains(currentTeam2.getTeamName())){
                    teams.add(currentTeam2.getTeamName());
                }
                ligue.add(currentTeam2);
            }
        }

        /*for (AllTeams allTeams : ligue) {
            System.out.println(allTeams.getTeamName());
            System.out.println(allTeams.getScore());
        }*/

        teams.sort(Comparator.reverseOrder());

        List<AllTeams> finalResult = new ArrayList<>();

        for (String team : teams) {
            int finalScore = 0;
            AllTeams current = new AllTeams();
            current.setTeamName(team);
            for (AllTeams allTeams : ligue) {
                if (team.equals(allTeams.getTeamName())){
                    finalScore += allTeams.getScore();
                }
            }
            current.setScore(finalScore);
            finalResult.add(current);
        }
        finalResult.sort(Comparator.comparingInt(p->p.getScore()));

        for (int i = finalResult.size() - 1; i >= 0; i--) {
            List<String> opponents = new ArrayList<>();
            for (String s : info) {
                Matcher matcher = pattern.matcher(s);
                if (matcher.find()){
                    if (finalResult.get(i).getTeamName().equals(matcher.group(1))){
                        if (!opponents.contains(matcher.group(2))){
                            opponents.add(matcher.group(2));
                        }
                    }
                    if (finalResult.get(i).getTeamName().equals(matcher.group(2))){
                        if (!opponents.contains(matcher.group(1))){
                            opponents.add(matcher.group(1));
                        }
                    }
                }
            }
            opponents.sort(Comparator.naturalOrder());
            System.out.println(finalResult.get(i).getTeamName());
            System.out.println("- Wins: " + finalResult.get(i).getScore());
            System.out.print("- Opponents: ");
            for (int j = 0; j < opponents.size(); j++) {
                if (j!= opponents.size()-1){
                    System.out.print(opponents.get(j)+ ", ");
                }
                else {
                    System.out.print(opponents.get(j));
                }

            }
            System.out.println();


        }
    }
}
