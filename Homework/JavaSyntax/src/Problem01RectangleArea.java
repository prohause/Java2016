import java.util.Scanner;

/**
 * Created by proha on 17-Mar-16.
 */
public class Problem01RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.next());
        int b = Integer.parseInt(input.next());
        int area = a * b;
        System.out.println(area);
    }
}
