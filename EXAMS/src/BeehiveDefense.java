import java.util.Scanner;

public class BeehiveDefense {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bees = Integer.parseInt(scanner.nextLine());
        int health = Integer.parseInt(scanner.nextLine());
        int attack = Integer.parseInt(scanner.nextLine());

        while (bees >= 100 && health > 0) {
            bees = bees - attack;
            health = health - (bees * 5);
        }
        if (bees < 0) {
            bees = 0;
        }
        if (bees < 100) {
            System.out.printf("The bear stole the honey! Bees left %d%n", bees);
        } else {
            System.out.printf("Beehive won! Bees left %d.", bees);
        }

    }
}
