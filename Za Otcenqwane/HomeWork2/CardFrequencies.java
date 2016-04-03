import java.util.*;

/**
 * Created by joro on 3/30/2016.
 */
public class CardFrequencies {

    public static void main(String[] args){
        String rxChars = "(♥|♣|♦|♠)";
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> ocurranceMap = new HashMap<>();
        //Split by anything that is not a character!
        String[] cards = sc.nextLine().split("\\s+");
        int cardInstanceCount = 0;

        for(String word: cards){
            if(word.length()==0) continue;
            Integer cnt = ocurranceMap.get(word);
            if(cnt==null) {
                cnt = 0;
                cardInstanceCount++;
            }
            cnt+=1;
            ocurranceMap.put(word, cnt);
        }

        for(Map.Entry<String, Integer> uCard: ocurranceMap.entrySet()){
            int cardCount = uCard.getValue();
            double frequency = (double)cardCount / (double)cardInstanceCount;
            String name = uCard.getKey().replaceAll(rxChars,"");
            //8 -> 10.00%
            System.out.println(String.format("%s -> %.2f", name, frequency));
        }



    }


}
