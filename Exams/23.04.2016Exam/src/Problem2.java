import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by proha on 23.4.2016 г..
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int col = scanner.nextInt();
        int row = scanner.nextInt();
        scanner.nextLine();

        ArrayList<ArrayList<Integer>> field = new ArrayList<>();
        ArrayList<Integer> rows = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            rows = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                rows.add((i * 5) + (j + 1));
            }
            field.add(rows);

        }

        System.out.println(field);
        String input = scanner.nextLine();
        while (!input.equals("Nuke it from orbit")) {
            String[] coords = input.split(" ");
            int x = Integer.parseInt(coords[0]);
            int y = Integer.parseInt(coords[1]);
            int radius = Integer.parseInt(coords[2]);
            System.out.println(x + " " + y + " " + radius);
            int starty = y-radius;
            if (starty < 0){
                starty = 0;
            }
            int endy = y+ radius;
            if (endy > field.size()){
                endy = field.size();
            }
            for (int i = 0; i < field.size(); i++) {

                if (i == y && x>=starty&&x<=endy) {
                    field.get(i).remove(y);

                    }
                }


            }
            System.out.println(field);
            input = scanner.nextLine();

        System.out.println(field);
    }


}
