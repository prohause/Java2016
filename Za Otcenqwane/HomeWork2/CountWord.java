

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by joro on 3/30/2016.
 */
public class CountWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String rxNoncharOrStart = "(^|[^a-zA-z])";
        String rxNoncharOrEnd = "([^a-zA-z]|$)";

        String text = sc.nextLine();
        String targetWord = sc.nextLine();
        Pattern rxTarget = Pattern.compile(rxNoncharOrStart + Pattern.quote(targetWord) + rxNoncharOrEnd, Pattern.CASE_INSENSITIVE);
        Matcher matcher = rxTarget.matcher(text);

        int matchCount = 0;
        while(matcher.find()) matchCount++;
        //Split by anything that is not a character!

        System.out.println(matchCount);
    }

}
