import java.util.Scanner;

/**
 * Created by proha on 11-Apr-16.
 */
public class Problem01VideoDurations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int minutes = 0;
        int hours = 0;
        int totalMinutes = 0;


        while (true) {
            if (input.toLowerCase().equals("end")) {
                break;
            }
            String[] separate = input.split(":");
            hours = Integer.parseInt(separate[0]);
            minutes = Integer.parseInt(separate[1]);
            totalMinutes += hours * 60 + minutes;
            input = scanner.nextLine();

        }
        hours = totalMinutes/60;
        minutes = totalMinutes%60;

        System.out.printf("%d:%02d%n", hours, minutes);
    }
}
