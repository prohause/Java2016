import java.util.Scanner;

/**
 * Created by ***** on 04-Apr-16.
 */
public class Problem02CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        String match = scanner.next().toLowerCase();
        int count = 0;

        for (int i = 0; i <= input.length() - match.length(); i++) {

            if (input.substring(i, match.length() + i).equals(match)) {
                count++;
            }

        }

        System.out.println(count);

    }
}
