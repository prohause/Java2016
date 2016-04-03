package Homework;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by xxx on 3/25/2016.
 */
public class _04_LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int count = 0;
        int temp = 0;
        int index = 0;

        for (int i = 0; i < line.length; i++) {
            count += 1;
            if (temp < count) {
                index = i - temp;
                temp = count;
            }

            if (i < line.length - 1) {

                if (Integer.parseInt(line[i]) >= Integer.parseInt(line[i + 1])) {
                    count = 0;
                }
            }
        }
        for (int i = 0; i < line.length; i++) {
            System.out.print(line[i]);
            if (i < line.length - 1) {
                if (Integer.parseInt(line[i]) >= Integer.parseInt(line[i + 1])) {
                    System.out.print("\r\n");
                } else {
                    System.out.print(" ");
                }
            }

        }
        System.out.println();
        System.out.print("Longest: ");
        for (int i = index; i < index + temp; i++) {
            System.out.printf("%s ", line[i]);
        }
    }
}