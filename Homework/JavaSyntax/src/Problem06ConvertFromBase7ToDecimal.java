import java.util.Scanner;

/**
 * Created by proha on 21-Mar-16.
 */
public class Problem06ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String base7 = input.next();
        Integer output = Integer.valueOf(base7, 7);
        System.out.println(output);
    }
}