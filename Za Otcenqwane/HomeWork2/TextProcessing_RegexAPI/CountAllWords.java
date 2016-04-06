package Homeworks.TextProcessing_RegexAPI;

import java.util.Scanner;

/**
 * Created by Eyub on 6.4.2016 г..
 * Problem 4
 * Write a program to count the number of words in given sentence.
 * Use any non-letter character as word separator.
 */
public class CountAllWords {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String[] input = scr.nextLine().split("\\W+");
        scr.close();

        System.out.println(input.length);
    }
}
