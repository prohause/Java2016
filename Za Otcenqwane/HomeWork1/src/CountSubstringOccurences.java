import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSubstringOccurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputText = input.nextLine().toLowerCase();
        String seachingWord = input.nextLine().toLowerCase();
        CountSubstring(inputText,seachingWord);
    }
    public static void CountSubstring (String input, String word){
        String regex = String.format("%s(?=%s)", word.charAt(0), word.substring(1,word.length()));
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(input);
        int counter = 0;
        while (match.find()){
              counter++;
        }

        System.out.println("Output: " + counter);
    }
}
