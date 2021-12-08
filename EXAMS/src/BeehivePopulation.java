import java.util.Scanner;

public class BeehivePopulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstPopulation = Integer.parseInt(scanner.nextLine());
        int years = Integer.parseInt(scanner.nextLine());
        int population = firstPopulation;

        for (int i = 1; i <= years; i++) {
            population = population + population / 10 * 2;
            if (i % 5 == 0) {
                population = population - (population / 50 * 5);
            }
            population = population - (population / 20 * 2);
        }
        System.out.printf("Beehive population: %d", population);

    }
}