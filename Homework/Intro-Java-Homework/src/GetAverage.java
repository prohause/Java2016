import java.text.DecimalFormat;
import java.util.Locale;

/**
 * Created by proha on 16-Mar-16.
 */
public class GetAverage {
    public static void main(String[] args) {
        double test = getaverage(1,2,6);
        DecimalFormat newformat = new DecimalFormat("#.00");
        System.out.println(newformat.format(test));

    }
    public static double getaverage(double a, double b, double c){
        double average = (a + b + c) /3;
        return average;
    }
}
