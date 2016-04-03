import java.util.List;
import java.util.Scanner;

/**
 * Created by proha on 22-Mar-16.
 */
public class Problem08OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String newInput = input.nextLine();
        String[] separate = newInput.split(" ");
        //System.out.println(separate.length);
        if (separate.length % 2 == 1) {
            System.out.println("Invalid length");
        } else {
            int[] numbers = new int[separate.length];
            for (int i = 0; i < separate.length; i++) {
                numbers[i] = Integer.parseInt(separate[i]);
                //System.out.println(numbers[i]);
            }
            for (int i = 0; i < numbers.length; i += 2) {
                if (numbers[i] % 2 != numbers[i + 1] % 2) {
                    System.out.println(numbers[i] + ", " + numbers[i + 1] + " -> different");
                }
                else if (numbers[i]%2 == 0){
                    System.out.println(numbers[i] + ", " + numbers[i + 1] + " -> both are even");
                }
                else {
                    System.out.println(numbers[i] + ", " + numbers[i + 1] + " -> both are odd");
                }
            }
        }
    }
}
