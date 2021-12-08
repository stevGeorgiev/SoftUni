import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double priceForOne = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        if (guests >= 10 && guests <=15){
            priceForOne *= 0.85;
        } else if (guests > 15 && guests <= 20){
            priceForOne *= 0.80;
        } else if (guests > 20){
            priceForOne *= 0.75;
        }
        double cake = budget * 0.1;
        double sum = guests * priceForOne + cake;

        if (budget >= sum){
            System.out.printf("It is party time! %.2f leva left." , Math.abs(budget-sum));
        } else {
            System.out.printf("No party! %.2f leva needed." , Math.abs(budget-sum));
        }

    }
}
