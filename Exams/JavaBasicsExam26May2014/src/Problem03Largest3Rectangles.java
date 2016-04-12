import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by proha on 11-Apr-16.
 */
public class Problem03Largest3Rectangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().replaceAll("\\s+", "");
        int area, bigestArea = 0;

        Pattern pattern = Pattern.compile("[0-9x]+");
        Matcher matcher = pattern.matcher(input);

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        while (matcher.find()) {
            String[] separate = matcher.group().split("x");
            a.add(Integer.parseInt(separate[0]));
            b.add(Integer.parseInt(separate[1]));
        }

        for (int i = 2; i < a.size(); i++) {
            area = (a.get(i - 2) * b.get(i - 2)) + (a.get(i - 1) * b.get(i - 1)) + (a.get(i) * b.get(i));
            if (area >= bigestArea) {
                bigestArea = area;
            }
        }

        System.out.println(bigestArea);
    }
}
