import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int result = 1;

        while (true) {
            if (result > n) {
                break;
            }
            System.out.println(result);
            result = result * 2 + 1;
        }
    }
}
