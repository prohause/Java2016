import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by joro on 3/30/2016.
 */
public class SortNumbers {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] nInts = sc.nextLine().split("\\s+");

        int[] numbers = new int[n];
        for(int i=0; i<n; i++){
            if(nInts[i].length()==0) continue;
            numbers[i] = Integer.parseInt(nInts[i]);
        }
        Arrays.sort(numbers);

// Or insertion sort
//        for(int i=1; i<numbers.length; i++){
//            int crVal = numbers[i];
//            int prevIx = i-1;
//            while(prevIx>=0 && numbers[prevIx]>crVal){ //If prev > current
//                //Switch current with previous
//                numbers[prevIx+1] = numbers[prevIx];
//                prevIx--;
//            }
//            numbers[prevIx+1] = crVal;
//        }

        printArray(numbers);

    }

    public static void printArray(int[] ints){
        (new ArrayList(Arrays.asList(ints))).forEach( (x) -> {
            System.out.print(Integer.toString((int)x) + ' ');
        } );
    }


}
