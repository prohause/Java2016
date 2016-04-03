import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by proha on 28-Mar-16.
 */
public class Problem10CardsFrequencies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a card sequence: ");
        String[] input = scanner.nextLine().split("[^\\w']+");

        ArrayList<String> cards = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            if (!cards.contains(input[i])) {
                cards.add(input[i]);
            }
        }

        for (String item:cards
             ) {
            System.out.printf(item + " -> " + "%.2f" , ((Collections.frequency(cards,item)/(float)input.length)*100));
            System.out.println(" %");
        }
    }
}
