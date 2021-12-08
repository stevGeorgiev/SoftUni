import java.lang.ref.SoftReference;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());


        totalPrice(product, quantity);


        //•	coffee – 1.50
        //•	water – 1.00
        //•	coke – 1.40
        //•	snacks – 2.00

    }

    private static void totalPrice(String product, double quantity) {
        double price = 0;

        if (product.equals("coffee")) {
            price = 1.50;
        } else if (product.equals("water")) {
            price = 1.00;
        } else if (product.equals("coke")) {
            price = 1.40;
        } else if (product.equals("snacks")) {
            price = 2.00;
        }

        double total = price * quantity;
        System.out.printf("%.2f", total);


    }


}
