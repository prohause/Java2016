import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by proha on 12-Apr-16.
 */
public class Problem02ThreeLargestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        List<BigDecimal> decimals = new ArrayList<>();
        List<String> output = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String newInput = scanner.nextLine();
            BigDecimal bigNumber = new BigDecimal(newInput);
            decimals.add(bigNumber);
            output.add(newInput);

        }

        decimals.sort(Comparator.reverseOrder());

        int counter = 0;

        while (counter < 3 && counter < decimals.size()) {
            for (int i = 0; i < output.size(); i++) {


                BigDecimal bigNumber = new BigDecimal(output.get(i));
                if (decimals.get(counter).equals(bigNumber)) {
                    System.out.println(output.get(i));
                    break;

                }
            }
            counter++;
        }
    }
}
