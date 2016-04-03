import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by proha on 28-Mar-16.
 */
public class Problem01SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input value for N: ");
        int count = scanner.nextInt();
        System.out.println("Please input " + count + " integer(s) separated by space: ");
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        for (int item:numbers
             ) {
            System.out.print(item + " ");
        }
    }
}
