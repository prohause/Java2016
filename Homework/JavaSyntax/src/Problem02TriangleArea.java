import java.util.Scanner;

/**
 * Created by proha on 17-Mar-16.
 */
public class Problem02TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] x = new int[3];
        int[] y = new int[3];
        for (int i = 0; i < 3; i++) {
            x[i] = Integer.parseInt(input.next());
            y[i] = Integer.parseInt(input.next());
        }
        if (x[0] == y[0] & x[1] == y[1] & x[2] == y[2]) {
            System.out.println(0);
        } else {
            int area = Math.abs((x[0] * (y[1] - y[2]) + x[1] * (y[2] - y[0]) + x[2] * (y[0] - y[1])) / 2);
            System.out.println(area);
        }
    }
}
