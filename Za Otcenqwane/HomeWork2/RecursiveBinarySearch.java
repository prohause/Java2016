import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by joro on 3/30/2016.
 */
public class RecursiveBinarySearch {

    public static void main(String[] args){
        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        List<Integer> numbers = new ArrayList<>();
        String input = sc.nextLine();
        for(String num: input.split(" ")){
            numbers.add(Integer.parseInt(num));
        }

        int position = findBinRecursively(number, numbers);
        System.out.println(position);
    }

    public static int findBinRecursively(int number, List<Integer> numbers){
        int midValue = 0;
        int pos = numbers.size()/2;

        if(numbers.size()==0) {
            return -1;
        } else if (numbers.size()==1 && numbers.get(0)!=number){
            return -1;
        } else if (numbers.size()==1 && numbers.get(0)==number){
            return 0;
        }

        if(numbers.size()%2==0){
            int posLow = pos - 1;
            int low = numbers.get(posLow);
            int high = numbers.get(pos);
            midValue = low + (high-low)/2;
        } else {

            midValue = numbers.get(pos);
            if(midValue==number) return pos;
        }

        if(midValue>number){
            //Value is too high, move left
            numbers = numbers.subList(0, pos); //Values left of cr. pos
            int foundPos = findBinRecursively(number, numbers);
            if(foundPos==-1) return -1;
            return pos + (-1)*foundPos; //foundPos acts as an offset to left, so *(-1)

        } else if(midValue<number){
            //Value is too low, move right
            numbers = numbers.subList(pos, numbers.size());
            int foundPos = findBinRecursively(number, numbers);
            if(foundPos==-1) return -1;
            return pos + foundPos; //foundPos acts as an offset to right

        } else return pos - 1;

    }

}
