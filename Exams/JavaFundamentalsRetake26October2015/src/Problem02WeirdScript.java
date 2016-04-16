import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by proha on 16-Apr-16.
 */
public class Problem02WeirdScript {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = scanner.nextInt();
        String toSearch = "";
        scanner.nextLine();
        if (key % 52 == 0) {
            key = 52;
        } else {
            key = key % 52;
        }
        if (key >= 1 && key <= 26) {
            key += 96;
            char mychar = (char) key;
            toSearch = Character.toString(mychar) + Character.toString(mychar);
        } else {
            key += 38;
            char mychar = (char) key;
            toSearch = Character.toString(mychar) + Character.toString(mychar);
        }

        String input = scanner.nextLine();
        toSearch = (toSearch + "(.*?)" + toSearch);

        Pattern pattern = Pattern.compile(toSearch);

        String totalText = "";

        while (!input.equals("End")) {
            totalText += input;
            input = scanner.nextLine();
        }

        Matcher matcher = pattern.matcher(totalText);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
