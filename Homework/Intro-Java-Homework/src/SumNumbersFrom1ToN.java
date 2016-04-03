import java.util.Scanner;

/**
 * Created by proha on 16-Mar-16.
 */
public class SumNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int end = Integer.parseInt(input.nextLine());
        long sum = 0; {
            for ( int i = 1; i <= end; i++) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
