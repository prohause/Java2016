import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by proha on 28-Mar-16.
 */
public class Problem09MostFrequentWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input some string: ");
        String[] input = scanner.nextLine().toLowerCase().split("[^\\w']+");
        ArrayList<String> output = new ArrayList<>();
        ArrayList<String> unique = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            output.add(input[i]);
        }

        for (int i = 0; i < input.length; i++) {
            if (!unique.contains(input[i])) {
                unique.add(input[i]);
            }
        }

        Collections.sort(unique);

        int count = 0;
        int totalCount = 0;

        for (String item : unique
                ) {
            count = Collections.frequency(output, item);
            if (count > totalCount) {
                totalCount = count;
            }
        }

        for (String item : unique
                ) {
            if (Collections.frequency(output, item) == totalCount) {
                System.out.println(item + " -> " + totalCount);
            }
        }
    }
}
