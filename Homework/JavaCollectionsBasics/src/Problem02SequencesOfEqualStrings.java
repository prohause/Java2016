import java.util.Scanner;

/**
 * Created by proha on 28-Mar-16.
 */
public class Problem02SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input random string separated by spaces: ");
        String input = scanner.nextLine();
        String[] separated = input.split(" ");

        System.out.print(separated[0] + " ");
        for (int i = 1; i < separated.length; i++) {
           if (!separated[i].equals(separated[i-1])){
               System.out.println();
           }
            System.out.print(separated[i] + " ");
        }
    }
}
