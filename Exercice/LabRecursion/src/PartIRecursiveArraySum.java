/**
 * Created by proha on 08-Apr-16.
 */
public class PartIRecursiveArraySum {

    public static int arraySum(int[] array, int lengh) {
        if (lengh == array.length) {
            return 0;
        }
        return array[lengh] + arraySum(array, lengh + 1);
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int sum = arraySum(array, 0);
        System.out.println(sum);
    }
}
