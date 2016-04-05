import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class FilterArray {
    public static Predicate<String> greaterThanTreeCharacters() {

        return (p)->p.length()>3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        List<String> result = Arrays.stream(input).filter(greaterThanTreeCharacters()).collect(Collectors.toList());
        if (result.size()==0){
            System.out.println("(empty)");
        }
        else {
            for (int i = 0; i<result.size();i++){
                    System.out.println(result.get(i)+" ");
            }
            System.out.println();
        }

    }
}
