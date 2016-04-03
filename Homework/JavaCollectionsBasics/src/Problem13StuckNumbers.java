import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by proha on 29-Mar-16.
 */
public class Problem13StuckNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] numbers = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        ArrayList<String> unmodified = new ArrayList<>();
        ArrayList<String> modified = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }
                unmodified.add(Integer.toString(numbers[i]) + "|" + Integer.toString(numbers[j]));
                modified.add(Integer.toString(numbers[i]) + Integer.toString(numbers[j]));
            }
        }

        Boolean stuck = false;

        for (int i = 0; i < modified.size(); i++) {
            for (int j = 0; j < modified.size(); j++) {
                String combined = (unmodified.get(i) + "|" + unmodified.get(j));
                String[] output = combined.split("[^\\w']+");
                if (output[0].equals(output[1]) || output[0].equals(output[2]) || output[0].equals(output[3]) || output[1].equals(output[2]) || output[1].equals(output[3]) || output[2].equals(output[3])) {
                    continue;
                }
                if (modified.get(i).equals(modified.get(j)) && i != j) {
                    System.out.println(unmodified.get(i) + "==" + unmodified.get(j));
                    stuck = true;
                }
            }
        }

        if (!stuck) {
            System.out.println("No");
        }
    }
}
