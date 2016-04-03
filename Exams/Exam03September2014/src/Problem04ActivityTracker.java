import org.omg.CORBA.Current;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by proha on 02-Apr-16.
 */

class Info{
    LocalDate data;
    String name;
    int steps;

    Info(LocalDate data,String name,int steps){
        this.data = data;
        this.name = name;
        this.steps = steps;
    }
}
public class Problem04ActivityTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        scanner.nextLine();

        System.out.println(LocalDate.now());



        Info[] workout = new Info[lines];
        workout[0].data = LocalDate.now();
        workout[0].name = "Pesho";
        workout[0].steps = 2000;

        System.out.println(workout[0].data + " " + workout[0].name + " "+ workout[0].steps);





    }
}
