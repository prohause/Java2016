package Homework;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by xxx on 3/24/2016.
 */
public class _01_SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int input = Integer.parseInt(line);

        String[] inputStr = sc.nextLine().split(" ");
        int[] result = new int[input];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(inputStr[i]);
        }
        Arrays.sort(result);
        for (int item : result) {
            System.out.print(item + " ");
        }

    }
}
