import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * Created by ***** on 31-Mar-16.
 */
public class Problem01FilterArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        ArrayList<String> words = new ArrayList<>(Arrays.asList(input));
        words.stream().filter(len -> len.length() > 3).forEach(p -> System.out.print(p));
    }
}
