import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by proha on 25-Mar-16.
 */
public class Test {
    private static final String FILE_PATH = "c:/test.txt";

    public static void main(String[] args) {
        BufferedReader reader = null;
        String input;
        try {
            File file = new File(FILE_PATH);
            reader = new BufferedReader(new FileReader(file));
            while ((input = reader.readLine()) != null){
                System.out.println(input);
            }

        } catch (java.io.IOException e) {
            System.out.println("File not found!");
        }

    }
}
