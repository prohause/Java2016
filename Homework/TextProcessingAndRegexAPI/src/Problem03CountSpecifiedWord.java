import java.util.Scanner;

/**
 * Created by ***** on 04-Apr-16.
 */
public class Problem03CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input[] = scanner.nextLine().toLowerCase().split("\\W+");
        String match = scanner.next().toLowerCase();
        int count = 0;

        for (String s : input) {

            if (s.equals(match)) {
                count++;
            }

        }

        System.out.println(count);
    }
}
