import java.util.Scanner;

/**
 * Created by ***** on 08-Apr-16.
 */
public class Problem05CombinationsWithoutRepetition {
    static boolean printable = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number <= 1) {
            System.out.println("Incorrect input!");
            number = scanner.nextInt();
        }

        int size = scanner.nextInt();

        while (size <= 1) {
            System.out.println("Incorrect input!");
            size = scanner.nextInt();
        }

        int[] array = new int[size];
        int some = 1;
        printAll(array, 0, number, size, printable);

    }

    public static void printAll(int[] array, int start, int number, int size, boolean printable) {


        if (start >= size && printable) {

            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();


        } else {
            for (int i = 1; i <= number; i++) {
                if (start >= 1 && array[start - 1] >= i) {
                    printable = false;
                } else {
                    printable = true;
                    array[start] = i;
                    printAll(array, start + 1, number, size, printable);
                }
            }
        }
    }

}
