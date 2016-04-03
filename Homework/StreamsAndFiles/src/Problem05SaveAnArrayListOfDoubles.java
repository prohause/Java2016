import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by proha on 27-Mar-16.
 */
public class Problem05SaveAnArrayListOfDoubles {
    private static final String SAVE_NAME = "doubles.list";

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        ArrayList<Double> output = new ArrayList<>();
        String[] input = scaner.nextLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            output.add(Double.parseDouble(input[i]));
        }

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(SAVE_NAME))) {

            for (double item : output
                    ) {
                outputStream.writeDouble(item);
            }
        } catch (Exception ex) {

        }
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(SAVE_NAME))) {

            int count = inputStream.available() / 8;

            for (int i = 0; i < count; i++) {
                System.out.println(inputStream.readDouble());

            }
        } catch (Exception ex) {

        }

    }
}
