import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by joro on 3/30/2016.
 */
public class BigSeqEqualStrings {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split("\\s+");
        HashMap<String, Integer> words = new HashMap<>();
        String largeSequenceKey = null;
        int maxSeqSize = -1;
        for (String word :
                strings) {
            Integer value = words.get(word);
            if(value==null) value = 1;
            else value += 1;
            words.put(word, value);
            if(value>maxSeqSize){
                largeSequenceKey = word;
                maxSeqSize = value;
            }
        }

        if(largeSequenceKey!=null){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<maxSeqSize; i++){
                sb.append(largeSequenceKey);
                if(i<(maxSeqSize-1)) sb.append(" ");
            }
        }

    }
}
