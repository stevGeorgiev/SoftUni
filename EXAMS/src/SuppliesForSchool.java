import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberPens = Integer.parseInt(scanner.nextLine());
        int numberMarkers = Integer.parseInt(scanner.nextLine());
        double literDrug = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double pricePen = numberPens * 5.80;
        double priceMark = numberMarkers * 7.20;
        double priceDrug = literDrug * 1.20;



        double sum = priceDrug + priceMark + pricePen;
        double sumDown = sum - sum * discount / 100;

        System.out.printf("%.3f", sumDown);

    }
}
