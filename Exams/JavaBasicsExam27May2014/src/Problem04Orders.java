import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by proha on 12-Apr-16.
 */
public class Problem04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        List<String> orders = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            orders.add(scanner.nextLine());
        }

        List<String> customers = new ArrayList<>();
        List<String> products = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            Pattern pattern = Pattern.compile("[a-zA-Z]+");
            Matcher matcher = pattern.matcher(orders.get(i));
            if (matcher.find() && !customers.contains(matcher.group())) {
                customers.add(matcher.group());
            }
            if (matcher.find() && !products.contains(matcher.group())) {
                products.add(matcher.group());
            }

        }

        customers.sort(Comparator.naturalOrder());

        for (String product : products) {
            System.out.print(product + ": ");

            Pattern patt = Pattern.compile("[0-9]+");

            int counter = 0;
            for (int i = 0; i < customers.size(); i++) {

                int sum = 0;
                Boolean contains = false;

                for (int j = 0; j < orders.size(); j++) {
                    Matcher matt = patt.matcher(orders.get(j));
                    if (orders.get(j).contains(customers.get(i)) && matt.find() && orders.get(j).contains(product)) {
                        sum += Integer.parseInt(matt.group());
                        contains = true;
                    }

                }
                if (contains) {
                    if (counter != 0) {
                        System.out.print(", " + customers.get(i) + " " + sum);
                    } else {
                        System.out.print(customers.get(i) + " " + sum);
                        counter++;
                    }

                }
            }
            System.out.println();
        }


    }
}
