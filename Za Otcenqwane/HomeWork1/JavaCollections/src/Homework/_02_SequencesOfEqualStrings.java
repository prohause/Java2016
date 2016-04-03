package Homework;

import java.util.Scanner;

/**
 * Created by xxx on 3/24/2016.
 */
public class _02_SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
            if (i < input.length - 1) {
                if (input[i].equals(input[i + 1])) {
                    System.out.print(" ");
                } else if (!input[i].equals(input[i + 1])) {
                    System.out.print("\r\n");
                }
            }
        }
    }

}

