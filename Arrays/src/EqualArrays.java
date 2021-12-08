import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayOne = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] arrayTwo = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean areEqual = true;
        int indexDiff = 0;


        if (arrayOne.length == arrayTwo.length) {
            for (int i = 0; i < arrayOne.length; i++) {
                if (arrayOne[i] != arrayTwo[i]) {
                    areEqual = false;
                    indexDiff = i;
                    break;
                }
            }
        } else {
            areEqual = false;
        }
        int sum = 0;
        if (areEqual) {
            for (int number : arrayOne) {
                sum += number;

            }
            System.out.printf("Arrays are identical. Sum: %d", sum);


        } else {
            System.out.println("Arrays are not identical. Found difference at " + indexDiff + " index.");
        }
    }
}