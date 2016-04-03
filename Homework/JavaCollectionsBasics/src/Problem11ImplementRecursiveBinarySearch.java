import java.util.Scanner;

/**
 * Created by proha on 29-Mar-16.
 */
public class Problem11ImplementRecursiveBinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number to compare");
        int compare = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please input some sorted numbers: ");
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int middle = numbers.length / 2;
        int current = -1;

        if (numbers[middle] == compare) {
            current = middle;
        } else if (numbers[middle] > compare) {
            for (int i = middle; i >= 0; i--) {
                if (numbers[i] == compare) {
                    current = i;
                }

            }
        } else {
            for (int i = middle; i < numbers.length; i++) {
                if (numbers[i] == compare) {
                    current = i;
                    break;
                }
            }
        }
        System.out.println(current);

    }
}
