import java.util.Scanner;

/**
 * Created by proha on 01-Apr-16.
 */
public class Problem01DozensOfEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String measure;
        int sum = 0;

        for (int i = 0; i < 7; i++) {
            count = scanner.nextInt();
            measure = scanner.next();

            if (measure.equals("dozens")){
                count *= 12;
            }
            sum +=count;

        }

        System.out.println(sum/12 + " dozens + " + sum%12 + " eggs");
    }
}
