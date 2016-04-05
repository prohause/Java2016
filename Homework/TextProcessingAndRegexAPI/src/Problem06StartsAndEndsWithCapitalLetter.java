import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ***** on 05-Apr-16.
 */
public class Problem06StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        Pattern pattern = Pattern.compile("([A-Z]+)([a-zA-Z]+)([A-Z]+)");

        for (String s : input) {
            Matcher matcher = pattern.matcher(s);
            if (matcher.find() && matcher.group().length() == s.length()) {
                System.out.print(matcher.group() + " ");
            }
        }

        System.out.println();
    }
}
