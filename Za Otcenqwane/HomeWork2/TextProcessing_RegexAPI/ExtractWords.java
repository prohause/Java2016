package Homeworks.TextProcessing_RegexAPI;

import java.util.regex.*;

import java.util.Scanner;

/**
 * Created by Eyub on 6.4.2016 г..
 * Problem 5
 * Write a program that extracts words from a string.
 * Words are sequences of characters that are at least two symbols long and consist
 * only of English alphabet letters. Use regex.
 */
public class ExtractWords {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String input = scr.nextLine();
        scr.close();

        Pattern p = Pattern.compile("([a-zA-Z]+){2,}");
        Matcher matcher = p.matcher(input);
        while (matcher.find()){
            System.out.print(matcher.group()+" ");
        }
        System.out.println();
    }
}
