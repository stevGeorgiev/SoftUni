import java.util.Scanner;
import java.util.function.DoublePredicate;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceFlourKg = Double.parseDouble(scanner.nextLine());
        double flourKg = Double.parseDouble(scanner.nextLine());
        double sugarKg = Double.parseDouble(scanner.nextLine());
        int packEggs = Integer.parseInt(scanner.nextLine());
        int packMaya = Integer.parseInt(scanner.nextLine());

        double priceSugarKg = priceFlourKg - priceFlourKg * 0.25;
        double pricePackEggs = priceFlourKg + priceFlourKg * 0.10;
        double pricePackMaya = priceSugarKg - priceSugarKg * 0.80;

        double sum = (priceFlourKg * flourKg) + (sugarKg * priceSugarKg) + (packEggs * pricePackEggs) + (pricePackMaya * packMaya);
        System.out.printf("%.2f" , sum);


    }
}
