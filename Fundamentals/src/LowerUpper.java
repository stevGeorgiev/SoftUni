import java.util.Scanner;

public class LowerUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = scanner.nextLine().charAt(0);

        if (ch>= 'A' && ch <= 'Z')
            System.out.println("upper-case");

        else if (ch >= 'a' && ch <= 'z')
            System.out.println("lower-case" );

    }
}
