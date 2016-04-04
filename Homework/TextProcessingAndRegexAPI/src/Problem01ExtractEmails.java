import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ***** on 04-Apr-16.
 */
public class Problem01ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern patern = Pattern.compile("[a-zA-Z0-9.-_]+@[a-zA-Z\\-]+([\\.][a-zA-Z\\-]+){1,3}");
        Matcher matcher = patern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
