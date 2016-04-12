import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by proha on 12-Apr-16.
 */
public class Problem03LongestOddEvenSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().trim().replaceAll(" ", "").split("[^-0-9]+");

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }

        int counter = 1;
        int currentCount = 1;

        if (numbers.get(0) == 0 && numbers.get(1)%2 == 0){
            numbers.set(0,1);
        }

        if (numbers.get(0) == 0 && numbers.get(1)%2 == 1){
            numbers.set(0,2);
        }

        for (int i = 1; i < numbers.size(); i++) {

            if (numbers.get(i) == 0 && numbers.get(i-1)%2 == 0){
                numbers.set(i,1);
            }

            if (numbers.get(i) == 0 && numbers.get(i-1)%2 == 1){
                numbers.set(i,2);
            }
        }

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i-1)%2!=numbers.get(i)%2){
                currentCount++;
                if (currentCount>counter){
                    counter = currentCount;
                }
            }
            else {
                currentCount = 1;
            }


        }
        System.out.println(counter);

    }
}
