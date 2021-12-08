import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfProducts = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>(0);

        for (int i = 0; i < numberOfProducts; i++) {
            String currentProduct = scanner.nextLine();
            products.add(currentProduct);

        }

        Collections.sort(products);
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d.%s%n" , i + 1 , products.get(i));
        }


    }
}
