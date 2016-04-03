import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by proha on 22-Mar-16.
 */
public class Problem11GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] inputNumbers = input.nextLine().split(" ");
        String useless = input.next();
        int count = input.nextInt();
        String oddOrEven = input.next();
        ArrayList<Integer> output = odds(inputNumbers,oddOrEven);
        if (count > output.size()){
            for (int i = 0; i < output.size();i++){
                System.out.print(output.get(i) + " ");
            }
        }
        else {
            for (int i = 0; i < count;i++){
                System.out.print(output.get(i) + " ");
            }
        }
    }

    public static ArrayList<Integer> odds(String numbers[], String type) {
        int[] allNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            allNumbers[i] = Integer.parseInt(numbers[i]);
        }
        ArrayList<Integer> newOdds = new ArrayList<>();
        ArrayList<Integer> newEvens = new ArrayList<>();
        for (int i = 0; i < allNumbers.length; i++) {
            if (allNumbers[i] % 2 == 0) {
                newEvens.add(allNumbers[i]);
            }
            if (allNumbers[i] % 2 == 1){
                newOdds.add(allNumbers[i]);
            }
        }
        ArrayList<Integer> finalArray = new ArrayList<>();
        if (type.equals("odd")) {
            finalArray = newOdds;
        }
        if (type.equals("even")){
            finalArray = newEvens;
        }
        return finalArray;
    }
}
