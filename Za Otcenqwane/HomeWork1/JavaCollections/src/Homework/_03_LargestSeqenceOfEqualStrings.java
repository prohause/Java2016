package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xxx on 3/24/2016.
 */
public class _03_LargestSeqenceOfEqualStrings {
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

                if (!line[i].equals(line[i + 1])) {
                    count = 0;
                }
            }
        }
        for (int i = index; i < index + temp; i++) {
            System.out.print(line[i] + " ");
        }

    }

}


