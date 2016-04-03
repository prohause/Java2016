import java.util.Scanner;

/**
 * Created by proha on 29-Mar-16.
 */
public class Problem15SimpleExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split("\\s*[+-]+\\s*");
        String[] operations = input.split("\\s*[0-9.]+\\s*");

        double sum = Double.parseDouble(numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            if (operations[i].equals("+")){
                sum += Double.parseDouble(numbers[i]);
            }
            else {
                sum -= Double.parseDouble(numbers[i]);
            }
            
        }
        System.out.printf("%.7f",sum);
    }
}
