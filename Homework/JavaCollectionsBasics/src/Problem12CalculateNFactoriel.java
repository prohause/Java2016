import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by proha on 29-Mar-16.
 */
public class Problem12CalculateNFactoriel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        BigInteger fact = new BigInteger("1");

        if (number >= 0 && number <= 1000) {
            for (int i = number; i > 1; i--) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            System.out.println(fact);
        } else {
            System.out.println("Invalid number! Aborting!");
        }
    }
}
