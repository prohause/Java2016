package Homework;

import java.util.Scanner;

/**
 * Created by xxx on 3/29/2016.
 */
public class _12_CalculateNFactorial {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(getFactorial(input));
    }
    public static int getFactorial(int number){
        if (number == 1 || number == 0){
            return 1;
        }

        else{
            int result = number * getFactorial(number - 1);
            return result;
        }
    }
}
