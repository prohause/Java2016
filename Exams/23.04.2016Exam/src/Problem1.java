import java.util.Scanner;

/**
 * Created by proha on 23.4.2016 г..
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String toMatch = scanner.nextLine();

        int first;
        int second;

        first = input.indexOf(toMatch);
        second = input.lastIndexOf(toMatch);
        boolean match = (first != second && first >= 0 && second >= 0);

        while (match) {
            input = input.substring(0,first) + input.substring(first+toMatch.length(),second) + input.substring(second+toMatch.length(),input.length());
            //current = new StringBuilder(input);
            //current = new StringBuilder(current.replace(second, second + toMatch.length(), ""));
            //current = new StringBuilder(current.replace(first, first + toMatch.length(), ""));
            //input = current.toString();
            System.out.println("Shaked it.");
            if (toMatch.length()>2){
                toMatch = toMatch.substring(0,toMatch.length()/2)+toMatch.substring(toMatch.length()/2+1,toMatch.length());
            }
            else if (toMatch.length()==2){
                toMatch = toMatch.substring(0,1);
            }
            else {
                break;
            }
           /* char[] newMatch = toMatch.toCharArray();
            toMatch = "";
            for (int i = 0; i < newMatch.length; i++) {
                if (i != newMatch.length / 2)
                    toMatch += newMatch[i];
            }*/
            //
            // System.out.println(toMatch);
            first = input.indexOf(toMatch);
            second = input.lastIndexOf(toMatch);
            match = first != second && first >= 0 && second >= 0;
        }
        System.out.println("No shake.");
        System.out.println(input);


    }
}
