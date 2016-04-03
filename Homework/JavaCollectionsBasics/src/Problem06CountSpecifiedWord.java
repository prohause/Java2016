import java.util.Scanner;

/**
 * Created by proha on 28-Mar-16.
 */
public class Problem06CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input main string: ");
        String[] input = scanner.nextLine().split("[^\\w']+");
        System.out.println("Please input word to match: ");
        String match = scanner.next();
        int count = 0;

        for (String item:input
             ) {
            if (item.toLowerCase().equals(match)){
                count++;
            }
        }
        System.out.println(count);
    }
}
