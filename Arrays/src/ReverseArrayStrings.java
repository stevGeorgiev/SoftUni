import java.util.Scanner;

public class ReverseArrayStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] arrayOfStrings = input.split(" ");

        for (int i = arrayOfStrings.length - 1; i >= 0; i--) {
            System.out.print(arrayOfStrings[i] + " ");

        }
    }
}

