import java.lang.reflect.Array;
import java.util.Scanner;

public class DemoTelerik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();


        if (a > 0 && b > 0 && c > 0) {
            System.out.println("+");
        } else if (a == 0 || b == 0 || c == 0) {
            System.out.println("0");
        } else {
            System.out.println("-");
        }
    }
}

