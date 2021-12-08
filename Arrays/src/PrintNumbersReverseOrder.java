import java.util.Scanner;

public class PrintNumbersReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumb = scanner.nextInt();

        int [] numbers = new int[totalNumb];

        for (int i = 0; i < totalNumb ; i++) {
            int number = scanner.nextInt();
              numbers[i] = number;
        }

        for (int i = numbers.length - 1; i >= 0 ; i--) {
            System.out.print(numbers[i] + " ");

        }

    }
}
