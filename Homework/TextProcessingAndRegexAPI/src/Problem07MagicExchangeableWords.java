import java.util.Scanner;

/**
 * Created by ***** on 05-Apr-16.
 */


public class Problem07MagicExchangeableWords {

    public static Boolean exchange(String a, String b) {
        Boolean exchangeable = true;
        char[] first = a.toCharArray();
        char[] second = b.toCharArray();
        char[][] all = new char[first.length][2];

        for (int i = 0; i < all.length; i++) {
            all[i][1] = first[i];
            all[i][0] = second[i];
        }

        for (int i = 0; i < all.length - 1; i++) {

            for (int j = i + 1; j < all.length; j++) {
                if (all[i][0] == all[j][0] && all[i][1] != all[j][1] || all[i][1] == all[j][1] && all[i][0] != all[j][0]) {
                    exchangeable = false;
                }

            }

        }

        return exchangeable;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstSet = scanner.next();
        String secondSet = scanner.next();

        if (firstSet.length() != secondSet.length()) {
            System.out.println("Size Mismatch!");

        } else {
            System.out.println(exchange(firstSet, secondSet));
        }
    }
}
