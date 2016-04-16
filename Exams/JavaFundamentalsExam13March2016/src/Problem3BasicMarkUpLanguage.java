import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by proha on 16-Apr-16.
 */
public class Problem3BasicMarkUpLanguage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = 0;
        Pattern inverse = Pattern.compile("\\s*?inverse\\s*?content\\s*?=\\s*?\"(\\s*?.*?\\s*?)\"");
        Pattern reverse = Pattern.compile("\\s*?reverse\\s*?content\\s*?=\\s*?\"(\\s*?.*?\\s*?)\"");
        Pattern repeat = Pattern.compile("\\s*?repeat\\s*?value\\s*?=\\s*?\"(\\s*?\\d+\\s*?)\"\\s*?content\\s*?=\\s*?\"(\\s*?.*?\\s*?)\"");

        while (!input.toLowerCase().equals("<stop/>")) {
            Matcher inv = inverse.matcher(input);
            Matcher rev = reverse.matcher(input);
            Matcher rep = repeat.matcher(input);
            if (rev.find()) {
                char[] output = rev.group(1).toCharArray();
                if (output.length != 0) {
                    count++;
                    System.out.print(count + ". ");
                    for (int i = 0; i < output.length; i++) {
                        System.out.print(output[output.length - i - 1]);
                    }
                    System.out.println();
                }

            }
            if (inv.find()) {

                char[] output = inv.group(1).toCharArray();
                if (output.length != 0) {
                    count++;
                    System.out.print(count + ". ");
                    for (int i = 0; i < output.length; i++) {
                        if (output[i] >= 65 && output[i] <= 90) {
                            char out = (char) (output[i] + 32);
                            System.out.print(out);
                        } else if (output[i] >= 97 && output[i] <= 122) {
                            char out = (char) (output[i] - 32);
                            System.out.print(out);
                        } else {
                            System.out.print(output[i]);
                        }
                    }
                    System.out.println();
                }
            }
            if (rep.find()) {
                //char[] output = rep.group(2).toCharArray();
                if (rep.group(2).length() > 0 && Integer.parseInt(rep.group(1)) > 0) {

                    for (int i = 0; i < Integer.parseInt(rep.group(1)); i++) {
                        count++;
                        System.out.println(count + ". " + rep.group(2));
                    }
                }
            }
            input = scanner.nextLine();
        }
    }
}
