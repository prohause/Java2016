import java.util.Scanner;

public class CountAllWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] text = scan.nextLine().split("\\w+");
        int finalresult = text.length - 1;
        System.out.println("Output: " + finalresult);
    }
}
