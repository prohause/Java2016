import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by proha on 23.4.2016 г..
 */
public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> allINput = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("It's testing time!")) {
            allINput.add(input);
            input = scanner.nextLine();
        }

        ArrayList<String> classes = new ArrayList<>();

        Pattern pattern = Pattern.compile("([A-Z][A-Za-z\\d+]+).*?([A-Z][A-Za-z\\d+]+).*?([A-Z][A-Za-z\\d+]+)");
        for (int i = 0; i < allINput.size(); i++) {
            Matcher matcher = pattern.matcher(allINput.get(i));
            if (matcher.find()) {
                if (!classes.contains(matcher.group(1))) {
                    classes.add(matcher.group(1));
                }
            }

        }
        classes.sort(Comparator.naturalOrder());
        //System.out.println(classes);


        ArrayList<ArrayList<String>> output = new ArrayList<>();

        for (String aClass : classes) {

            ArrayList<String> current = new ArrayList<>();
            ArrayList<String> methods = new ArrayList<>();

            //ArrayList<String> current = new ArrayList<>();

            for (int i = 0; i < allINput.size(); i++) {
                Matcher matcher = pattern.matcher(allINput.get(i));
                //System.out.println(aClass);
                if (matcher.find() && matcher.group(1).equals(aClass)) {
                    if (!methods.contains(matcher.group(2))) {
                        methods.add(matcher.group(2));
                    }
                }

            }
            //System.out.println(methods);
            methods.sort(Comparator.naturalOrder());
            for (String method : methods) {
                ArrayList<String> test = new ArrayList<>();
                for (int i = 0; i < allINput.size(); i++) {
                    Matcher matcher = pattern.matcher(allINput.get(i));
                    //System.out.println(aClass);

                    if (matcher.find() && matcher.group(1).equals(aClass) && matcher.group(2).equals(method)) {
                        current.add(aClass);
                        current.add(method);
                        if (!test.contains(matcher.group(3))) {
                            test.add(matcher.group(3));
                            current.add(matcher.group(3));
                        }

                    }


                }


                output.add(current);
            }

        }

        //System.out.println(output);

        ArrayList<ArrayList<String>> last = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < output.size(); i++) {
            if (max < output.get(i).size()) {
                max = output.get(i).size();
            }

        }
        //System.out.println(max);
        while (max > 0) {
            for (ArrayList<String> strings : output) {
                if (strings.size() == max) {
                    for (int i = 0; i < strings.size(); i++) {
                        if (i == 0) {
                            System.out.println(strings.get(i) + ":");
                        } else if (i == 1) {
                            System.out.println("##" + strings.get(i));
                        }else{
                            System.out.println("####" + strings.get(i));
                        }


                    }
                }
            }
            max--;
        }

    }
}
