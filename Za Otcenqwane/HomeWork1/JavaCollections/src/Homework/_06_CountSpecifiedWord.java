package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xxx on 3/25/2016.
 */
public class _06_CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String word = sc.nextLine();
        int count = 0;
        List words = new ArrayList<>();

        for (String s : line.split("[\\p{P} \\t\\n\\r]")) {
            if (s.equals("")){
                continue;
            }
            else{
                s = s.toLowerCase();
                words.add(s);
            }
        }
        for (int i = 0; i < words.size() ; i++) {
            if (word.equals(words.get(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}