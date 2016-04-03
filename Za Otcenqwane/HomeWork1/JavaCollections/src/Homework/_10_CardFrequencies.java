package Homework;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by xxx on 3/28/2016.
 */
public class _10_CardFrequencies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<String> allMatches = new ArrayList<String>();
        Matcher m = Pattern.compile("\\w+")
                .matcher(input);
        while (m.find()) {
            allMatches.add(m.group());
        }
        LinkedHashMap<String, Double> finalData = new LinkedHashMap<>();
        for (int i = 0; i < allMatches.size(); i++) {
            double count = 0;
            for (int j = 0; j < allMatches.size(); j++) {
                if (allMatches.get(i).equals(allMatches.get(j))) {
                    count++;
                }
            }
            finalData.put(allMatches.get(i), count / allMatches.size() * 100);
        }
        for (String key : finalData.keySet()) {

            System.out.printf("%s -> %.2f%%\r\n", key, finalData.get(key));
        }
    }
}
