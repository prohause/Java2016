import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputText = input.nextLine().toLowerCase();
        String searching = input.nextLine().toLowerCase();
        Counter(inputText,searching);
    }
    public static void Counter (String input, String word){
        Pattern pattern = Pattern.compile(word);
        Matcher match = pattern.matcher(input);
        int counter = 0;
        while (match.find()){
            counter++;
        }
        System.out.println("Output: " + counter);
    }
}
