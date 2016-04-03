import java.util.*;


public class ExtractUniqueWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String rxSplit = "[^a-zA-z]";
        List<String> alphaWords = new ArrayList<>();

        //Split by anything that is not a character!
        String[] strings = sc.nextLine().split(rxSplit);

        for(String word: strings){
            if(word.length()==0) continue;
            if(!alphaWords.contains(word)) alphaWords.add(word);
        }
        Collections.sort(alphaWords, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //Compare backwards, so that a>z
                return Character.compare(o1.charAt(1), o2.charAt(0));
            }
        });
        for(int i=0; i<alphaWords.size(); i++){
            String word = alphaWords.get(i);
            System.out.print(word);
            if(i<(alphaWords.size()-1)) System.out.print(" ");
            System.out.print(System.getProperty("line.separator"));
        }


    }
}
