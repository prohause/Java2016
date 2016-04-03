package Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xxx on 3/28/2016.
 */
public class _08_ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<String> line = new ArrayList<>();
        List<String> result = new ArrayList<>();
        for (String s : input.split("[\\p{P} \\t\\n\\r]")) {
            if (s.equals("")) {
                continue;
            } else {
                s = s.toLowerCase();
                line.add(s);
            }
        }
        result.add(line.get(0));
        for (int i = 0; i < line.size() ; i++) {
            boolean validWord = true;
            for (int j = 0; j < result.size() ; j++) {
                if (line.get(i).equals(result.get(j))){
                    validWord = false;
                    break;
                }

            }
            if (validWord == true){
                result.add(line.get(i));
            }
        }
        Collections.sort(result);
        for (String item : result) {
            System.out.print(item + " ");
        }
    }
}
