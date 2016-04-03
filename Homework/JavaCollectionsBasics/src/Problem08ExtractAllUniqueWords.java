import java.util.*;

/**
 * Created by proha on 28-Mar-16.
 */
public class Problem08ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input some string: ");
        String[] input = scanner.nextLine().toLowerCase().split("[^\\w']+");
        ArrayList<String> output = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            if (!output.contains(input[i])) {
                output.add(input[i]);
            }
        }

        Collections.sort(output);

        for (String item : output
                ) {
            System.out.print(item + " ");
        }
    }
}
