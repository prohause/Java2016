import java.util.Scanner;

/**
 * Created by proha on 22-Mar-16.
 */
public class Problem09HitTheTarget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        if (target <= 20) {
            for (int i = 1; i < target; i++) {
                System.out.println(i + " + " + (target - i) + " = " + target);
            }
            for (int i = 20; i > target; i--) {
                System.out.println(i + " - " + (i - target) + " = " + target);
            }
        } else {
            for (int i = target - 20; i <= 20; i++) {
                System.out.println(i + " + " + (target - i) + " = " + target);
            }
        }
    }
}
