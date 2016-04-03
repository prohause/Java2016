import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by joro on 3/30/2016.
 */
public class SeqEqualStrings {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split("\\s+");
        HashMap<String, Integer> words = new HashMap<>();
        for (String word :
                strings) {
            Integer value = words.get(word);
            if(value==null) value = 1;
            else value += 1;
            words.put(word, value);
        }

        for (Map.Entry<String, Integer> kvpair :
                words.entrySet()) {
            StringBuilder sb = new StringBuilder();
            int count = kvpair.getValue();
            for(int i=0; i<count; i++){
                sb.append(kvpair.getKey());
                if(i<(count-1)) sb.append(" ");
            }
            System.out.println(sb.toString());
        }


    }
}
