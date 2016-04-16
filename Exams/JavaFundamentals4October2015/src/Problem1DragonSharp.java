import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by proha on 15-Apr-16.
 */
public class Problem1DragonSharp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = scanner.nextInt();
        Boolean correct = true;
        int wrongLine = 0;
        scanner.nextLine();

        Pattern patternIf = Pattern.compile("if \\([0-9]+[<>=]+[0-9]+\\) ?(loop)? ?([0-9]+)? out \".+\";");
        Pattern patternElse = Pattern.compile("else ?(loop)? ?([0-9]+)? out \".+\";");

        String[] input = new String[lines];
        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextLine();
            Matcher matcherIf = patternIf.matcher(input[i]);
            Matcher matcherElse = patternElse.matcher(input[i]);
            if (input[i].contains("if") && matcherIf.find()) {
                continue;
            } else if (input[i].contains("else") && matcherElse.find()) {
                continue;
            } else {
                correct = false;
                wrongLine = i + 1;
                break;
            }
        }

        if (!correct) {
            System.out.println("Compile time error @ line " + wrongLine);
            return;
        }

        Boolean statement = false;

        for (int i = 0; i < input.length; i++) {
            patternIf = Pattern.compile("[0-9]+[<>=]+[0-9]");
            Matcher matcherIf = patternIf.matcher(input[i]);
            if (input[i].contains("if")&&matcherIf.find()){
                String found = matcherIf.group();
                int first,second;
                first = Integer.parseInt(found.split("[<>=]+")[0]);
                second = Integer.parseInt(found.split("[<>=]+")[1]);
                int out = 1;

            }

        }

    }
}
