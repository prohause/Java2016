import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by joro on 3/30/2016.
 */
public class CountWords {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String rxSplit = "[^a-zA-z]";
        //Split by anything that is not a character!
        String[] strings = sc.nextLine().split(rxSplit);
        int count = 0;
        for(String word: strings){
            if(word.length()==0) continue;
            count++;
        }
        System.out.println(count);
    }

}
