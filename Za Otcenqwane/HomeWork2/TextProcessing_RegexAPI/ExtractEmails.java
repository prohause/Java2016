package Homeworks.TextProcessing_RegexAPI;

import java.util.Scanner;

/**
 * Created by Eyub on 6.4.2016 г..
 * Problem 1
 * Write a program to extract all email addresses from given text.
 * The text comes at the first input line.
 * Print the emails in the output, each at a separate line.
 * Emails are considered to be in format <user>@<host>, where:
 * •	<user> is a sequence of letters and digits, where '.', '-' and '_' can appear between them.
 * Examples of valid users: "stephan", "mike03", "s.johnson", "st_steward", "softuni-bulgaria", "12345".
 * Examples of invalid users: ''--123", ".....", "nakov_-", "_steve", ".info".
 * •	<host> is a sequence of at least two words, separated by dots '.'.
 * Each word is sequence of letters and can have hyphens '-' between the letters.
 * Examples of hosts: "softuni.bg", "software-university.com", "intoprogramming.info", "mail.softuni.org".
 * Examples of invalid hosts: "helloworld", ".unknown.soft.", "invalid-host-", "invalid-".
 * •	Example of valid emails: info@softuni-bulgaria.org, kiki@hotmail.co.uk, no-reply@github.com,
 * s.peterson@mail.uu.net, info-bg@software-university.software.academy
 */
public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] line = scn.nextLine().split(" ");
        String[] emails;
        for (int i = 0; i < line.length; i++) {
            if (isEmail(line[i])) {
                line[i] = fixIfNeed(line[i]);
                System.out.println(line[i]);
            }
        }

    }

    public static String fixIfNeed(String s) {
        String ns = new String();
        if (s.endsWith(".")) {
            for (int i = 0; i < s.length()-1; i++) {
                ns+=s.charAt(i);
            }
            return ns;
        }else{
            return s;
        }

    }

    public static boolean isEmail(String s) {
        if ((!s.contains("@")) || (!s.contains(".")) || (s.length() < 5)
                || (s.startsWith("-")) || (s.endsWith("-"))
                || (s.startsWith("_")) || (s.endsWith("_"))
                || (s.startsWith("."))) {
            return false;
        }
        return true;
    }
}
