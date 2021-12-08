import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int neededSum = Integer.parseInt(scanner.nextLine());


        for (int index = 0; index <= numbers.length - 1; index++) {
            int number = numbers[index];
            for (int i = index + 1; i <= numbers.length - 1; i++) {


                int numberTwo = numbers[i];
                if (number + numberTwo == neededSum) {
                    System.out.printf("%d %d%n", number, numberTwo);
                }
            }
        }
    }
}

