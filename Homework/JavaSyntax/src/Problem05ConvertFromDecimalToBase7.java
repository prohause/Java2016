import java.util.Scanner;

/**
 * Created by proha on 21-Mar-16.
 */
public class Problem05ConvertFromDecimalToBase7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String output = Integer.toString(a, 7);
        System.out.println(output);
    }
}
