import java.awt.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by proha on 23.4.2016 г..
 */
public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<String> output = new ArrayList<>();

        ArrayList<Long> point = new ArrayList<>();

        while (!input.equals("Break it.")) {
            output.add(input.trim().replace(" ", ", "));
            String[] separate = input.split(" ");
            long critical = Math.abs((Long.parseLong(separate[2]) + Long.parseLong(separate[3])) - (Long.parseLong(separate[0]) + Long.parseLong(separate[1])));

            if (!point.contains(critical) && critical != 0) {
                point.add(critical);
            }
            if (point.size() > 1) {
                System.out.println("Critical breakpoint does not exist.");
                return;
            }
            //System.out.println(critical);
            input = scanner.nextLine();
        }

        //ArrayList<Long> critPoint = new ArrayList<>();
        /*point.sort(Comparator.reverseOrder());
        //System.out.println(point.get(0));
        Long finalCrit = point.get(0).longValue();
        for (int i = 1; i < point.size(); i++) {
            //System.out.println(point.get(i));
            if (point.get(i).longValue() != finalCrit) {
                if (point.get(i).longValue() != 0) {

                }

            }

        }*/
        //System.out.println(critPoint);
        for (String s : output) {
            System.out.println("Line: [" + s + "]");
        }
        //System.out.println(point.get(0));
        BigDecimal test = BigDecimal.valueOf(Math.pow(point.get(0),output.size()));
        BigInteger brek = BigInteger.valueOf(0);
        BigInteger test1 = BigInteger.valueOf(point.get(0));
        BigInteger test2 = BigInteger.valueOf(output.size());
        brek = brek.modPow(test1,test2);
        brek = brek.mod(test2);

        System.out.println("Critical Breakpoint: " + brek);


    }
}
