import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        Pattern pattern = Pattern.compile("[a-z@.]+");
        Matcher match = pattern.matcher(str);
        while (match.find()){
            if (match.group().length() == 1){
                continue;
            }
            if (match.group().contains("@")){
                System.out.println(match.group());
            }
        }

    }
}
