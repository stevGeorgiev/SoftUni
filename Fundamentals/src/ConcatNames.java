import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String one = scanner.nextLine();
        String two = scanner.nextLine();
        String three = scanner.nextLine();

        System.out.printf("%s%s%s" , one , three , two);


    }
}
