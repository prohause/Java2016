package Homeworks.TextProcessing_RegexAPI;

import java.util.Scanner;

/**
 * Created by X on 6.4.2016 г..
 * Problem 3
 * Write a program to find how many times a word appears in given text.
 * The text is given at the first input line.
 * The target word is given at the second input line.
 * The output is an integer number. Please ignore the character casing.
 * Consider that any non-letter character is a word separator.
 */
public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String[] input = scr.nextLine().toLowerCase().split("\\W");
        String target = scr.nextLine().toLowerCase();
        scr.close();

        int ocurences = 0;

        for (String s:input) {
            if (s.equals(target)){
                ocurences++;
            }
        }
        System.out.println(ocurences);
    }
}
