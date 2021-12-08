import java.util.Scanner;

public class HoneyHarvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFlower = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double honeyMade = 0;

        switch (season) {
            case "Spring":
                if (typeFlower.equals("Sunflower")) {
                    honeyMade = countFlowers * 10;
                } else if (typeFlower.equals("Daisy")) {
                    honeyMade = countFlowers * 1.10 * 12;
                } else if (typeFlower.equals("Lavender")) {
                    honeyMade = countFlowers * 12;
                } else if (typeFlower.equals("Mint")) {
                    honeyMade = countFlowers * 1.10 * 10;
                }
                break;
            case "Summer":
                if (typeFlower.equals("Sunflower")) {
                    honeyMade = countFlowers * 1.10 * 8;
                } else if (typeFlower.equals("Daisy")) {
                    honeyMade = countFlowers * 1.10 * 8;
                } else if (typeFlower.equals("Lavender")) {
                    honeyMade = countFlowers * 1.10 * 8;
                } else if (typeFlower.equals("Mint")) {
                    honeyMade = countFlowers * 1.10 * 12;
                }
                break;
            case "Autumn":
                if (typeFlower.equals("Sunflower")) {
                    honeyMade = countFlowers * 0.95 * 12;
                } else if (typeFlower.equals("Daisy")) {
                    honeyMade = countFlowers * 0.95 * 6;
                } else if (typeFlower.equals("Lavender")) {
                    honeyMade = countFlowers * 0.95 * 6;
                } else if (typeFlower.equals("Mint")) {
                    honeyMade = countFlowers * 0.95 * 6;
                }
                break;

        }
        System.out.printf("Total honey harvested: %.2f" , honeyMade);

    }
}