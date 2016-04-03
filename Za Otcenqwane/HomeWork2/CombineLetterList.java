import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by joro on 3/30/2016.
 */
public class CombineLetterList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Character> l1 = new ArrayList<>();
        List<Character> l2 = new ArrayList<>();
        StringBuilder buffer = new StringBuilder();

        for(String charx: sc.nextLine().split("\\s+")){
            char e = charx.charAt(0);
            l1.add(e);
            buffer.append(e).append(" ");
        }
        for(String charx: sc.nextLine().split("\\s+")){
            l2.add(charx.charAt(0));
        }

        l2.forEach( (c) -> {
            if(!l1.contains(c)){
                l1.add(c);
                buffer.append(c).append(" ");
            }
        });

        System.out.println(buffer.toString());

    }


}
