import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by proha on 27-Mar-16.
 */
public class Problem04CopyJpgFile {
    private static final String PATH_NAME = "my.jpg";
    private static final String SAVE_NAME = "my-copied-picture.jpg";

    public static void main(String[] args) {
        FileInputStream input = null;
        FileOutputStream output = null;

        try {
            input = new FileInputStream(PATH_NAME);
            output = new FileOutputStream(SAVE_NAME);
            int currentByte = input.read();
            while (currentByte != -1) {
                output.write(currentByte);
                currentByte = input.read();
            }
            input.close();
            output.close();
        } catch (IOException ex) {

        }
    }
}
