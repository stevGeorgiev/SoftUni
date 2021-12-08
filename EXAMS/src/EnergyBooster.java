import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String sizeSet = scanner.nextLine();
        int purchasedSets = Integer.parseInt(scanner.nextLine());
        double priceForOne = 0;
        double sum = 0;

        switch (fruit) {
            case "Watermelon":
                if (sizeSet.equals("small")) {
                    priceForOne = 2 * 56;
                } else if (sizeSet.equals("big")) {
                    priceForOne = 5 * 28.70;
                }
                break;
            case "Mango":
                if (sizeSet.equals("small")) {
                    priceForOne = 2 * 36.66;
                } else if (sizeSet.equals("big")) {
                    priceForOne = 5 * 19.60;
                }
                break;
            case "Pineapple":
                if (sizeSet.equals("small")) {
                    priceForOne = 2 * 42.10;
                } else if (sizeSet.equals("big")) {
                    priceForOne = 5 * 24.80;
                }
                break;
            case "Raspberry":
                if (sizeSet.equals("small")) {
                    priceForOne = 2 * 20;
                } else if (sizeSet.equals("big")) {
                    priceForOne = 5 * 15.20;
                }
                break;

        }


        sum = purchasedSets * priceForOne;
        if (sum >= 400 && sum <= 1000) {
            sum = sum - sum * 0.15;
        } else if (sum > 1000){
            sum *= 0.50;
        }
        System.out.printf("%.2f lv." , sum);
    }
}
