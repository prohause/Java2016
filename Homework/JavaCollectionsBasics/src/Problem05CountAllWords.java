import java.util.Scanner;

/**
 * Created by proha on 28-Mar-16.
 */
public class Problem05CountAllWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input some string: ");
        String[] input = scanner.nextLine().split("[^\\w']+");
        System.out.println(input.length);
    }
}
