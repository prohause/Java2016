import java.util.Scanner;

/**
 * Created by proha on 16-Mar-16.
 */
public class GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String test = input.nextLine();
        int number = Integer.parseInt(test);
        int count = test.length();
        for (int i = count - 1; i >= 0; i--) {
            int temp = (int)Math.floor(number / Math.pow(10,i));
              switch (temp) {
                case 0: System.out.print("Gee");break;
                case 1: System.out.print("Bro");break;
                case 2: System.out.print("Zuz");break;
                case 3: System.out.print("Ma");break;
                case 4: System.out.print("Duh");break;
                case 5: System.out.print("Yo");break;
                case 6: System.out.print("Dis");break;
                case 7: System.out.print("Hood");break;
                case 8: System.out.print("Jam");break;
                case 9: System.out.print("Mack");break;
                    default:break;
            }
            number = number %  (int)Math.pow(10,i);
        }
        System.out.println();
    }
}
