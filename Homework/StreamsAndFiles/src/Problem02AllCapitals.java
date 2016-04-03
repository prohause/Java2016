import java.io.*;

/**
 * Created by proha on 27-Mar-16.
 */
public class Problem02AllCapitals {
    private static final String PATH_NAME = "problem02.txt";
    private static final String SAVE_NAME = "problem02out.txt";

    public static void main(String[] args) {
        File fileIn = new File(PATH_NAME);
        File fileOut = new File(SAVE_NAME);
        BufferedReader reader = null;
        PrintWriter writer = null;
        String input;
        String capitals;

        try {
            reader = new BufferedReader(new FileReader(fileIn));
            writer = new PrintWriter(new FileWriter(fileOut));
            while ((input = reader.readLine()) != null) {
                capitals = input.toUpperCase();
                writer.write(capitals + System.getProperty("line.separator"));
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");

        } catch (IOException ex) {

        } finally {
            writer.close();
        }
        fileIn.delete();
        fileOut.renameTo(fileIn);
    }
}
