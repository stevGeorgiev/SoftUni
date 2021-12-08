import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());
        int three = Integer.parseInt(scanner.nextLine());
        int four = Integer.parseInt(scanner.nextLine());

        //Add first to the second, divide (integer) the sum by the third number and multiply the result by the fourth number. Print the result.

        long sum = ((one + two) / three) * four;
        System.out.println(sum);


    }
}
