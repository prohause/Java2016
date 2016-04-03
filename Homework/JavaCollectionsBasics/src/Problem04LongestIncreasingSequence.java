import java.util.Scanner;

/**
 * Created by proha on 28-Mar-16.
 */
public class Problem04LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input some integers: ");
        String[] input = scanner.nextLine().split(" ");

        int[] numbers = new int[input.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int current = 1;
        int total = 1;
        int position = 0;
        System.out.print(numbers[0] + " ");
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] <= numbers[i - 1]) {
                System.out.println();
                System.out.print(numbers[i] + " ");
                if (current > total) {
                    total = current;
                }
                current = 1;
            } else {
                System.out.print(numbers[i] + " ");
                current++;
                if (current > total) {
                    total = current;
                    position = i - total + 1;
                }
            }
        }
        System.out.println();
        System.out.print("Longest: ");
        for (int i = position; i < position + total; i++) {
            System.out.print(numbers[i] + " ");

        }
    }
}
