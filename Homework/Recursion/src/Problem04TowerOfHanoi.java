import java.util.Scanner;
import java.util.Stack;

/**
 * Created by ***** on 09-Apr-16.
 */
public class Problem04TowerOfHanoi {
    public int counter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        size = scanner.nextInt();


        while (size < 3 || size > 10) {
            System.out.println("Invaild input! 3 - 10");
            size = scanner.nextInt();
        }

        Stack<Integer> source = new Stack<>();
        Stack<Integer> dest = new Stack<>();
        Stack<Integer> spare = new Stack<>();

        for (int i = size; i >= 1; i--) {
            source.push(i);
        }

        System.out.println(source);
        //System.out.println(dest);
        //System.out.println(spare);

        Move(size,source,dest,spare,1);

    }

    public static void Move(int bottom, Stack<Integer> source, Stack<Integer> dest, Stack<Integer> spare, int count) {
        if (bottom == 1) {
            dest.push(source.pop());
            System.out.println(dest);
            System.out.println(count);
        }
        else {
            spare.push(source.pop());
            dest.push(source.pop());
            dest.push(spare.pop());
            System.out.println(count);
            count++;

            //System.out.println(source);
            //System.out.println(dest);
            //System.out.println(spare);
            Move(bottom-1,source,dest,spare,count);


        }
    }

    //public static void print()
}
