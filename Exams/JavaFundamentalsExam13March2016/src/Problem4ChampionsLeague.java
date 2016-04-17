import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by proha on 16-Apr-16.
 */
public class Problem4ChampionsLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("(\\D+\\s*?)\\s+\\|\\s+(\\D+\\s*?)\\s+\\|\\s+(\\d+:\\d+)\\s\\|\\s(\\d+:\\d+)");

        while (!input.equals("stop")){
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                System.out.println(matcher.group(1));
                System.out.println(matcher.group(2));
                System.out.println(matcher.group(3));
                System.out.println(matcher.group(4));
            }
            input = scanner.nextLine();
        }

    }
}
