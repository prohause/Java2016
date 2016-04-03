package Homework;

import jdk.nashorn.internal.ir.IfNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xxx on 3/25/2016.
 */
public class _05_CountAllWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int count = 0;

        for (String s : line.split("[\\p{P} \\t\\n\\r]")) {
            if (s.equals("")) {
                continue;
            } else {
                count += 1;

            }
        }
        System.out.println(count);
    }
}

