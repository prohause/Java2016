import java.util.Scanner;

/**
 * Created by proha on 01-Apr-16.
 */
public class Problem02AddingAngles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] angles = new int[number];

        for (int i = 0; i < angles.length; i++) {
            angles[i] = scanner.nextInt();
        }

        boolean available = false;

        for (int i = 0; i < angles.length - 2; i++) {
            for (int j = i + 1; j < angles.length - 1; j++) {
                for (int k = j + 1; k < angles.length; k++) {
                    int sum = angles[i] + angles[j] + angles[k];
                    if (sum % 360 == 0) {
                        System.out.println(angles[i] + " + " + angles[j] + " + " + angles[k] + " = " + sum + " degrees");
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
