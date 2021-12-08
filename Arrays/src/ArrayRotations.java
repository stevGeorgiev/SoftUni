import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class ArrayRotations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] numbers = scanner.nextLine().split(",");
        int countRotations = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= countRotations; rotation++) {
            String firstNumber = numbers[0];

            for (int index = 0; index < numbers.length - 1; index++) {
                numbers[index] = numbers[index + 1];
            }
            numbers[numbers.length - 1] = firstNumber;
        }
         String finalList = String.join(",", numbers);
        System.out.println(finalList);
    }
}
