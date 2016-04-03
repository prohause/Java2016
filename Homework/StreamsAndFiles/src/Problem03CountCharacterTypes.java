import java.io.*;

/**
 * Created by proha on 27-Mar-16.
 */
public class Problem03CountCharacterTypes {
    private static final String PATH_NAME = "words.txt";
    public static final String SAVE_NAME = "count-chars.txt";

    public static void main(String[] args) {
        File inFile = new File(PATH_NAME);
        File outFile = new File(SAVE_NAME);
        BufferedReader reader;
        PrintWriter writer = null;
        String input;
        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;

        try {
            reader = new BufferedReader(new FileReader(inFile));
            while ((input = reader.readLine()) != null) {
                for (int i = 0; i < input.length(); i++) {
                    int value = input.toLowerCase().charAt(i);
                    if (value == 97 || value == 101 || value == 105 || value == 111 || value == 117) {
                        vowels++;
                        continue;
                    }
                    if (value >= 97 && value <= 122) {
                        consonants++;
                        continue;
                    }
                    if (value == 33 || value == 44 || value == 46 || value == 63) {
                        punctuation++;
                    }

                }
            }
            reader.close();

            writer = new PrintWriter(new FileWriter(outFile));
            writer.write("Vowels: " + vowels + System.getProperty("line.separator"));
            writer.write("Consonants: " + consonants + System.getProperty("line.separator"));
            writer.write("Punctuation: " + punctuation + System.getProperty("line.separator"));

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            writer.close();
        }

    }

}
