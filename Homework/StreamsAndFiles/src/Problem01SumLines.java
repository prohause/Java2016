import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by proha on 26-Mar-16.
 */
public class Problem01SumLines {
    private static final String PATH_NAME = "problem01.txt";

    public static void main(String[] args) {
        BufferedReader reader = null;
        String input;
        File file = new File(PATH_NAME);
        try {

            reader = new BufferedReader(new FileReader(file));
            while ((input = reader.readLine()) != null) {
                //System.out.println(input);
                int sum = 0;
                char[] chars = input.toCharArray();
                for (char item:chars
                     ) {
                    sum += item;
                }
                System.out.println(sum);
            }
        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }
}
