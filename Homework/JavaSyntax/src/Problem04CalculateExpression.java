import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;

/**
 * Created by proha on 21-Mar-16.
 */
public class Problem04CalculateExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        float firstFormula = (float) Math.pow(((a * a + b * b) / (a * a - b * b)), (a + b + c) / Math.sqrt(c));
        float secondFormula = (float) Math.pow((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3)), (a - b));
        float average1 = (a + b + c) / 3;
        float average2 = (firstFormula + secondFormula) / 2;
        System.out.printf("F1 result: " + "%.2f" + "; F2 result: " + "%.2f" + "; Diff: " + "%.2f", firstFormula, secondFormula, average1 - average2);
    }
}
