import java.util.Scanner;

/**
 * Created by proha on 17-Apr-16.
 */
public class Problem1CollectResources {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int nPaths = scanner.nextInt();
        scanner.nextLine();
        int[][] path = new int[nPaths][2];

        for (int i = 0; i < path.length; i++) {
            String[] current = scanner.nextLine().split(" ");
            path[i][0] = Integer.parseInt(current[0]);
            path[i][1] = Integer.parseInt(current[1]);
        }

        for (String s : input) {
            System.out.println(s);
        }

        for (int[] ints : path) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}
