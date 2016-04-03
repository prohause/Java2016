import java.util.Scanner;

/**
 * Created by proha on 28-Mar-16.
 */
public class Problem03LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input some string: ");
        String[] input = scanner.nextLine().split(" ");
        String largest = input[0];
        int totalCcount = 1;
        int currentCount = 1;

        for (int i = 1; i < input.length; i++) {
            if (input[i].equals(input[i - 1])) {
                currentCount++;
                if (currentCount > totalCcount) {
                    totalCcount = currentCount;
                    largest = input[i];
                }
            } else {
                currentCount = 1;
            }

        }
        for (int i = 1; i <= totalCcount; i++) {
            System.out.print(largest + " ");

        }
    }
}

