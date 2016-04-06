import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String pattern = "[a-zA-Z]+";
        Pattern patrn  = Pattern.compile(pattern);
        Matcher match = patrn.matcher(text);
        while (match.find()) {
            System.out.print(match.group() + " ");
        }
    }
}
