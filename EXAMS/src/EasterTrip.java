import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String date = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double priceForNight = 0;

        switch (destination) {
            case "France":
                if (date.equals("21-23")) {
                    priceForNight = 30;
                } else if (date.equals("24-27")) {
                    priceForNight = 35;
                } else if (date.equals("28-31")) {
                    priceForNight = 40;
                }
                break;
            case "Italy":
                if (date.equals("21-23")) {
                    priceForNight = 28;
                } else if (date.equals("24-27")) {
                    priceForNight = 32;
                } else if (date.equals("28-31")) {
                    priceForNight = 39;
                }
                break;
            case "Germany":
                if (date.equals("21-23")) {
                    priceForNight = 32;
                } else if (date.equals("24-27")) {
                    priceForNight = 37;
                } else if (date.equals("28-31")) {
                    priceForNight = 43;
                }
                break;
        }
        double sum = nights * priceForNight;

        System.out.printf("Easter trip to %s : %.2f leva.", destination, sum);

    }
}
