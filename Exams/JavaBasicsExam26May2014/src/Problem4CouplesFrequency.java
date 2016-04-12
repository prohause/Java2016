import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by proha on 12-Apr-16.
 */
public class Problem4CouplesFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input[] = scanner.nextLine().split("[^-0-9]");

        List<String> couples = new ArrayList<>();

        for (int i = 1; i < input.length; i++) {
            couples.add(input[i - 1] + " " + input[i]);
        }

        List<String> unique = new ArrayList<>();

        for (String couple : couples) {
            if (!unique.contains(couple)){
                unique.add(couple);
            }

        }



        System.out.println();

        for (String s : unique) {
            int counter = 0;
            float percent;
            for (int i = 0; i < couples.size(); i++) {
                if (s.equals(couples.get(i))){
                    counter++;
                }

            }
            percent = ((float)counter/couples.size())*100;
            System.out.printf(s + " -> %.02f" ,percent);
            System.out.println("%");
        }
    }
}
