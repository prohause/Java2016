package Homeworks.TextProcessing_RegexAPI;

import java.util.Scanner;

/**
 * Created by Eyub on 6.4.2016 г..
 * Problem 2
 * Write a program to find how many times given string appears in given text as substring.
 * The text is given at the first input line.
 * The search string is given at the second input line.
 * The output is an integer number. Please ignore the character casing.
 */
public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        //trim can be unused depend of input
        String input = scr.nextLine().trim().toLowerCase();
        String sub = scr.nextLine().trim().toLowerCase();
        scr.close();
        int ocurences = 0;
        for (int i = 0; i < (input.length()-sub.length()+1); i++) {
            String temp =input.substring(i,i+sub.length());
            if (sub.equals(temp)){
                ocurences++;
            }
        }
        System.out.println(ocurences);
    }
}
