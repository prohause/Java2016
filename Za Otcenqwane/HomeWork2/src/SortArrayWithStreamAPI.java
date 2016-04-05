import java.util.*;
import java.util.stream.Collectors;

public class SortArrayWithStreamAPI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        String order = sc.nextLine();
        if (order.equals("Descending")) {
            List<String> result = Arrays.stream(arr).sorted((e1,e2) -> (e2.compareTo(e1))).collect(Collectors.toList());
            for (int i = 0; i <result.size() ; i++) {
                System.out.print(result.get(i)+" ");
            }
            System.out.println();

        } else {
            List<String> result = Arrays.stream(arr).sorted().collect(Collectors.toList());
            for (int i = 0; i <result.size() ; i++) {
                System.out.print(result.get(i)+" ");
            }
            System.out.println();
        }
    }

}
