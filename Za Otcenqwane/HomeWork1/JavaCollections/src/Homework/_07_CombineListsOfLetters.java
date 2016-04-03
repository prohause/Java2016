package Homework;

import javax.xml.stream.events.Characters;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xxx on 3/25/2016.
 */
public class _07_CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputOne = sc.nextLine();

        String inputTwo = sc.nextLine();

        ArrayList<Character> lineOne = new ArrayList<>();

        for (int i = 0; i < inputOne.length(); i++) {
            if (inputOne.charAt(i) != ' ') {
                lineOne.add(inputOne.charAt(i));
            }
        }

        ArrayList<Character> lineTwo = new ArrayList<>();
        for (int i = 0; i < inputTwo.length(); i++) {
            if (inputTwo.charAt(i) != ' ') {
                lineTwo.add(inputTwo.charAt(i));
            }
        }


        ArrayList<Character> result = new ArrayList<>();
        boolean validChar = true;
        boolean temp = false;
        for (int i = 0; i < lineOne.size(); i++) {
            result.add(lineOne.get(i));
        }
        for (int i = 0; i < lineTwo.size(); i++) {
            validChar = true;
            for (int j = 0; j < lineOne.size(); j++) {
                if (lineTwo.get(i) == lineOne.get(j)) {
                    validChar = false;
                    break;
                }
            }
            if (validChar == true) {
                result.add(lineTwo.get(i));
            }
        }
        for (Character item : result) {
            System.out.print(item + " ");
        }

    }
}
