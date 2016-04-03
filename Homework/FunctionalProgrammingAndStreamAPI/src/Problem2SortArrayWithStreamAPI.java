import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by ***** on 31-Mar-16.
 */

public class Problem2SortArrayWithStreamAPI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String order = scanner.next().toLowerCase();

        List<String> numbers = new ArrayList<>(Arrays.asList(input));
        List <Integer> sortedList;

        if (order.equals("ascending")){
            sortedList = numbers.stream().map(Integer::parseInt).sorted().collect(Collectors.toList());
        }
        else {
            sortedList = numbers.stream().map(Integer::parseInt).sorted(Collections.reverseOrder()).collect(Collectors.toList());
        }
        sortedList.stream().forEach(p -> System.out.print(p + " "));
    }

}


