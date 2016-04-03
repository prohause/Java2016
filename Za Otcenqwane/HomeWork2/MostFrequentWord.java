import java.util.*;

/**
 * Created by joro on 3/30/2016.
 */
public class MostFrequentWord {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String rxSplit = "[^a-zA-z]";
        HashMap<String, Integer> ocurranceMap = new HashMap<>();
        //Split by anything that is not a character!
        String[] strings = sc.nextLine().split(rxSplit);

        for(String word: strings){
            if(word.length()==0) continue;
            Integer cnt = ocurranceMap.get(word);
            if(cnt==null) cnt = 0;
            cnt++;
            ocurranceMap.put(word, cnt);
        }

        Map.Entry<String, Integer> maxEntry = null;
        List<String> frequentWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : ocurranceMap.entrySet())
        {
            if(maxEntry==null){
                maxEntry = entry;
            } else {
                int mxEntry = maxEntry.getValue();
                int crEntry = entry.getValue();
                if(crEntry>mxEntry){
                    maxEntry = entry;
                    frequentWords.clear();
                } else if(crEntry==mxEntry){
                    if(!frequentWords.contains(entry.getKey())) frequentWords.add(entry.getKey());
                }
            }
        }

        if(maxEntry!=null){
            int count = maxEntry.getValue();
            System.out.println(String.format("%s -> %d times", maxEntry.getKey(), count));
            frequentWords.forEach( (c) -> {
                System.out.println(String.format("%s -> %d times", c, count));
            });
        }
    }
}
