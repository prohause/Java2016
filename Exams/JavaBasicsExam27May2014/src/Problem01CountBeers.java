import java.util.Scanner;

/**
 * Created by proha on 12-Apr-16.
 */
public class Problem01CountBeers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int totalBeers = 0;
        int beers = 0;

        while (!input.toLowerCase().equals("end")){
            String measure = input.toLowerCase().split(" ")[1];
            beers = Integer.parseInt(input.split(" ")[0]);

            switch (measure){
                case "beers":totalBeers += beers;break;
                case "stacks":totalBeers += beers*20;break;
                default:break;
            }
            input = scanner.nextLine();
        }

        System.out.println(totalBeers/20 + " stacks + " + totalBeers%20 + " beers");
    }
}
