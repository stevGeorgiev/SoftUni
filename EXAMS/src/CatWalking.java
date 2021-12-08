import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minWalking = Integer.parseInt(scanner.nextLine());
        int countWalks = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());


        int walkAllDay = minWalking * countWalks;
        int burnedCalories = walkAllDay * 5;

        if (burnedCalories >= calories / 2){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d." , burnedCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d." , burnedCalories);
        }
    }
}
