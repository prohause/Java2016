import java.util.Scanner;

/**
 * Created by ***** on 08-Apr-16.
 */
public class Problem02NestedLoopsToRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number < 0 ){
            System.out.println("Incorrect input!");
            number = scanner.nextInt();
        }

        int[] array = new int[number];
        printAll(array,0);


    }

    public static void printAll(int[] array,int number){
        if (number >=array.length){
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
        else {
            for (int i = 1; i <= array.length; i++) {
                array[number] = i;
                printAll(array,number+1);

            }
        }
    }
}
