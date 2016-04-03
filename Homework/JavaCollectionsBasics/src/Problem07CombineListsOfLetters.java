import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by proha on 28-Mar-16.
 */
public class Problem07CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input first line: ");
        String line1 = scanner.nextLine().replace(" ", "");
        System.out.println("Please input second line: ");
        String line2 = scanner.nextLine().replace(" ", "");

        char[] firstLine = line1.toCharArray();
        char[] secondLine = line2.toCharArray();

        for (char item : firstLine
                ) {
            System.out.print(item + " ");
        }

        for (char item : secondLine
                ) {
            Boolean contains = false;
            for (int i = 0; i < firstLine.length; i++) {
                if (item == firstLine[i]) {
                    contains = true;
                }
            }
            if (!contains) {
                System.out.print(item + " ");
            }
        }
    }
}
