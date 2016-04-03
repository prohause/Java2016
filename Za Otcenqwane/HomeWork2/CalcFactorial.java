import java.util.Scanner;
import java.util.Stack;

/**
 * Created by joro on 3/30/2016.
 */
public class CalcFactorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = fact(n);
        System.out.println(factorial);
    }

    public static int fact(int n)
    {
        if(n!=1) return n*fact(n-1);
        else return 1;
    }
}
