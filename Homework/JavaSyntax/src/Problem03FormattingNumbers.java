import java.util.Scanner;

/**
 * Created by proha on 17-Mar-16.
 */
public class Problem03FormattingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = -1;
        while (a < 0 || a > 500) {
            System.out.println("Please input value for a: ");
            a = input.nextInt();
        }
        float b = input.nextFloat();
        float c = input.nextFloat();
        String hex = Integer.toHexString(a);
        String binary = Integer.toBinaryString(a);
        System.out.printf("|" + "%-10s" + "|" + "%10s" + "|" + "%10.2f" + "|" + "%-10.3f" + "|", hex, String.format("%10s", binary).replace(' ', '0'), b, c);
    }
}
