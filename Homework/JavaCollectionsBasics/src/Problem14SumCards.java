import java.util.Scanner;

/**
 * Created by proha on 29-Mar-16.
 */
public class Problem14SumCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s*[SHDC]+\\s*");
        int[] cards = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            int value = 0;

            switch (input[i]) {
                case "J":
                    value = 12;
                    break;
                case "Q":
                    value = 13;
                    break;
                case "K":
                    value = 14;
                    break;
                case "A":
                    value = 15;
                    break;
                case "2":
                    value = 2;
                    break;
                case "3":
                    value = 3;
                    break;
                case "4":
                    value = 4;
                    break;
                case "5":
                    value = 5;
                    break;
                case "6":
                    value = 6;
                    break;
                case "7":
                    value = 7;
                    break;
                case "8":
                    value = 8;
                    break;
                case "9":
                    value = 9;
                    break;
                case "10":
                    value = 10;
                    break;
                default:
                    break;
            }
            cards[i] = value;

        }

        int sum = cards[0];

        if (cards[0] == cards[1]) {
            sum = sum * 2;
        }

        for (int i = 1; i < cards.length - 1; i++) {
            if (cards[i - 1] == cards[i] || cards[i] == cards[i + 1]) {
                sum += cards[i] * 2;

            } else {
                sum += cards[i];
            }
        }
        if (cards[cards.length - 1] == cards[cards.length - 2]) {
            sum += cards[cards.length - 1] * 2;

        } else {
            sum += cards[cards.length - 1];
        }

        System.out.println(sum);
    }
}
