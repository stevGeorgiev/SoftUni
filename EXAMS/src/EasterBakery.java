import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countKozunak = Integer.parseInt(scanner.nextLine());
        int countPackEggs = Integer.parseInt(scanner.nextLine());
        int kurabiiKg = Integer.parseInt(scanner.nextLine());

        double kozunak = 3.20;
        double priceEggs = 4.35;
        double kurabii = 5.40;
        double paintForEgg = 0.15;

        double sum = (countKozunak * kozunak) + (countPackEggs * priceEggs) + (kurabii * kurabiiKg) + (paintForEgg * 12 * countPackEggs);

        System.out.printf("%.2f", sum);



    }
}
