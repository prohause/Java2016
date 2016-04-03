import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by proha on 21-Mar-16.
 */
public class Problem07RandomizeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] numbers = new Integer[2];
        numbers[0] = input.nextInt();
        numbers[1] = input.nextInt();
        if (numbers [0] != numbers[1]){
            Arrays.sort(numbers);
            int count = numbers[1] - numbers[0] + 1;
            Integer[] randomize = new Integer[count];
            int arrayCount = 0;
            Random rand = new Random();
            while (arrayCount < count) {
                int temp = rand.nextInt(numbers[1] - numbers[0]) + numbers[0];
                Boolean isTrue = Arrays.asList(randomize).contains(temp);
                if (!isTrue){
                    randomize[arrayCount] = temp;
                    arrayCount++;
                    System.out.printf("%s" + " ", temp);
                }
            }
        }
        else {
            System.out.println(numbers[0]);
        }
    }
}
