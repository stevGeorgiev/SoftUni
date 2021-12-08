import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double guests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());


        double countKozinaci = Math.ceil(guests / 3);
        double eggsNeeded = Math.ceil(guests * 2);
        double priceKozunaci = Math.ceil(countKozinaci * 4);
        double priceEggs = eggsNeeded * 0.45;

        double sum = priceEggs + priceKozunaci;

        if (budget >= sum){
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.%n" , countKozinaci , eggsNeeded);
            System.out.printf("He has %.2f lv. left." , budget - sum);

        } else {
            System.out.printf("Lyubo doesn't have enough money.%n");
            System.out.printf("He needs %.2f lv. more." , Math.abs(sum - budget));
        }


    }
}
