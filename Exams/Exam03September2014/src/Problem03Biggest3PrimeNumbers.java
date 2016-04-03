import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by proha on 01-Apr-16.
 */
public class Problem03Biggest3PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("[( )]+");

        /*ArrayList<Integer> primeNumbers = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61,
                67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109,
                113, 127, 131, 137, 139, 149, 151, 157, 163, 167,
                173, 179, 181, 191, 193, 197, 199, 211, 223, 227,
                229, 233, 239, 241, 251, 257, 263, 269, 271, 277,
                281, 283, 293, 307, 311, 313, 317, 331, 337, 347,
                349, 353, 359, 367, 373, 379, 383, 389, 397, 401,
                409, 419, 421, 431, 433, 439, 443, 449, 457, 461,
                463, 467, 479, 487, 491, 499, 503, 509, 521, 523,
                541, 547, 557, 563, 569, 571, 577, 587, 593, 599,
                601, 607, 613, 617, 619, 631, 641, 643, 647, 653,
                659, 661, 673, 677, 683, 691, 701, 709, 719, 727,
                733, 739, 743, 751, 757, 761, 769, 773, 787, 797,
                809, 811, 821, 823, 827, 829, 839, 853, 857, 859,
                863, 877, 881, 883, 887, 907, 911, 919, 929, 937,
                941, 947, 953, 967, 971, 977, 983, 991, 997));*/



       /* for (int i = 3; i <= 100; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primeNumbers.add(i);
            }
        }
        System.out.println(primeNumbers);*/

        ArrayList<Integer> numbers = new ArrayList<>();
        for (String item : input
                ) {
            //item = item.replaceAll("\\(", "");
            //item = item.replaceAll("\\)", "");
            if (item.trim().isEmpty() || Integer.parseInt(item) <= 1) {
                continue;
            }
            numbers.add(Integer.parseInt(item));
        }
        ArrayList<Integer> destict = new ArrayList<>(numbers.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList()));

        //if (destict.size() >= 3) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < destict.size(); i++) {
            for (int j = 2; j < destict.get(i); j++) {
                if (destict.get(i) % j == 0) {
                    break;
                } else {
                    sum += destict.get(i);
                    count++;
                }

            }
            if (count >= 3) {
                break;
            }

        }
        System.out.println(sum);
        //} else {
        //    System.out.println("No");
        //}

        if (count == 3) {
            System.out.println(sum);
        } else {
            System.out.println("No");
        }

    }
}
