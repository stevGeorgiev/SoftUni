import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        switch (group) {
            case "Students":
                if (day.equals("Friday")) {
                    price = 8.45;
                } else if (day.equals("Saturday")) {
                    price = 9.80;
                } else if (day.equals("Sunday")) {
                    price = 10.46;
                }
                break;

            case "Business":
                if (day.equals("Friday")) {
                    price = 10.90;
                } else if (day.equals("Saturday")) {
                    price = 15.60;
                } else if (day.equals("Sunday")) {
                    price = 16;
                }
                break;

            case "Regular":
                if (day.equals("Friday")) {
                    price = 15;
                } else if (day.equals("Saturday")) {
                    price = 20;
                } else if (day.equals("Sunday")) {
                    price = 22.50;
                }
                break;

        }
                double total = price * people;

        if (group.equals("Students") && people >= 30){
            total *= 0.85;
        } else if (group.equals("Business") && people >= 100){
            price = price * 10;
            total -= price;

        } else if (group.equals("Regular") && people >= 10 && people <= 20){
            total *= 0.95;
        }
        System.out.printf("Total price: %.2f" , total);

    }
}
