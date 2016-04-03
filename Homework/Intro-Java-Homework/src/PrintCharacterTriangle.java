import java.util.Scanner;

/**
 * Created by proha on 16-Mar-16.
 */
public class PrintCharacterTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int end = Integer.parseInt(input.nextLine());
        for (int i = 0; i < end; i++) {
            for (char c = 'a'; c <= 'a' + i; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        for (int i = end - 1; i > 0 ; i--) {
            for (char c = 'a'; c < 'a' + i; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }
}
