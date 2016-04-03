package Homework;

import java.util.*;
import java.util.function.Predicate;

/**
 * Created by xxx on 3/28/2016.
 */
public class _09_MostFrequentWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<String> line = new ArrayList<>();
        for (String s : input.split("[\\p{P} \\t\\n\\r]")) {
            if (s.equals("")) {
                continue;
            } else {
                s = s.toLowerCase();
                line.add(s);

            }
        }
        TreeMap<String, Integer> wordList = new TreeMap<>();
        for (int i = 0; i < line.size(); i++) {
            int count = 0;
            for (int j = 0; j < line.size(); j++) {
                if (line.get(i).equals(line.get(j))) {
                    count++;
                }
            }
            wordList.put(line.get(i), count);

        }
        Map.Entry<String, Integer> maxEntry = null;

        for (Map.Entry<String, Integer> entry : wordList.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }

        for (String key : wordList.keySet()) {
            if (maxEntry.getValue() == wordList.get(key)) {
                System.out.println(key + " -> " + wordList.get(key) + " times");

            }
        }


    }
}