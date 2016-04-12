import java.util.Scanner;

/**
 * Created by proha on 11-Apr-16.
 */
public class Problem02PythagoreanNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Integer[] numbers = new Integer[count];
        boolean available = false;


        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {

                for (int k = 0; k < count; k++) {

                    if (numbers[i] * numbers[i] + numbers[j] * numbers[j] == numbers[k] * numbers[k] && numbers[i] <= numbers[j]) {
                        System.out.println(numbers[i] + "*" + numbers[i] + " + " + numbers[j] + "*" + numbers[j] + " = " + numbers[k] + "*" + numbers[k]);
                        available = true;
                    }

                }

            }

        }

        if (!available) {
            System.out.println("No");
        }
    }
}
