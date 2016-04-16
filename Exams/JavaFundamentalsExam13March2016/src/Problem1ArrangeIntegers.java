import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by proha on 16-Apr-16.
 */
public class Problem1ArrangeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        List<String> toSort = new ArrayList<>();

        for (String s : input) {
            String toAdd = "";
            for (int i = 0; i < s.length(); i++) {
                switch (s.charAt(i)) {
                    case '0':
                        toAdd += "zero-";
                        break;
                    case '1':
                        toAdd += "one-";
                        break;
                    case '2':
                        toAdd += "two-";
                        break;
                    case '3':
                        toAdd += "three-";
                        break;
                    case '4':
                        toAdd += "four-";
                        break;
                    case '5':
                        toAdd += "five-";
                        break;
                    case '6':
                        toAdd += "six-";
                        break;
                    case '7':
                        toAdd += "seven-";
                        break;
                    case '8':
                        toAdd += "eight-";
                        break;
                    case '9':
                        toAdd += "nine-";
                        break;
                    default:
                        break;
                }
            }
            toSort.add(toAdd);
        }
        //System.out.println(toSort);
        toSort.sort(Comparator.naturalOrder());
        //System.out.println(toSort);
        for (int i = 0; i < toSort.size(); i++) {
            String sorted = "";
            String[] separate = toSort.get(i).split("-");
            for (String s : separate) {
                switch (s) {
                    case "zero":
                        sorted += "0";
                        break;
                    case "one":
                        sorted += "1";
                        break;
                    case "two":
                        sorted += "2";
                        break;
                    case "three":
                        sorted += "3";
                        break;
                    case "four":
                        sorted += "4";
                        break;
                    case "five":
                        sorted += "5";
                        break;
                    case "six":
                        sorted += "6";
                        break;
                    case "seven":
                        sorted += "7";
                        break;
                    case "eight":
                        sorted += "8";
                        break;
                    case "nine":
                        sorted += "9";
                        break;
                    default:
                        break;
                }

            }
            if (i != toSort.size()-1){
                System.out.print(sorted + ", ");
            }
            else {
                System.out.println(sorted);
            }

        }
    }
}
