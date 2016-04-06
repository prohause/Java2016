import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by ***** on 08-Apr-16.
 */
public class Problem01ReverseArray {

    static int start,end,size;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> array = Arrays.asList(scanner.nextLine().split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
        size = array.size();
        start = 0;
        end = size-1;

        reverse(array,start,end);

        for (Integer integer : array) {
            System.out.print(integer + " ");
        }

    }

    public static List<Integer> reverse(List<Integer> toReverse, int start, int end){
        if (start > size/2 || end <size/2){
            return toReverse;
        }

        int holder;
        holder = toReverse.get(start);
        toReverse.set(start,toReverse.get(end));
        toReverse.set(end,holder);
        reverse(toReverse,start+1,end-1);
        return toReverse;

    }
}
