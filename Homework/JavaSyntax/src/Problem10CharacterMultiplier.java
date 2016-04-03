import java.util.Scanner;

/**
 * Created by proha on 22-Mar-16.
 */
public class Problem10CharacterMultiplier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first = input.next();
        String second = input.next();
        System.out.println(Multi(first, second));

    }

    public static int Multi(String first, String second) {
        int multiply = 0;
        char[] firstChar = first.toCharArray();
        char[] secondChar = second.toCharArray();
        if (firstChar.length == secondChar.length) {
            for (int i = 0; i < firstChar.length; i++) {
                int temp1 = firstChar[i];
                int temp2 = secondChar[i];
                multiply += temp1 * temp2;
            }
        } else if (firstChar.length > secondChar.length) {
            for (int i = 0; i < secondChar.length; i++) {
                int temp1 = firstChar[i];
                int temp2 = secondChar[i];
                multiply += temp1 * temp2;
            }
            for (int i = secondChar.length; i < firstChar.length; i++) {
                int temp1 = firstChar[i];
                multiply += temp1;
            }
        } else {
            for (int i = 0; i < firstChar.length; i++) {
                int temp1 = firstChar[i];
                int temp2 = secondChar[i];
                multiply += temp1 * temp2;
            }
            for (int i = firstChar.length; i < secondChar.length;i++){
                int temp2 = secondChar[i];
                multiply += temp2;
            }
        }
        return multiply;
    }
}
