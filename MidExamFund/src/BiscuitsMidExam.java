import java.util.Scanner;

public class BiscuitsMidExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int productionForOnePerDay = Integer.parseInt(scanner.nextLine());
        int countOfWorkers = Integer.parseInt(scanner.nextLine());
        int countBiscuitsToCompare = Integer.parseInt(scanner.nextLine());


        int biscuitsPerMonth = 0;


        for (int day = 1; day < 31; day++) {
            double dailyProduction = 0;

            if (day % 3 == 0) {
                dailyProduction = Math.floor((productionForOnePerDay * countOfWorkers) * 0.75);
            } else {
                dailyProduction = Math.floor(productionForOnePerDay * countOfWorkers);
            }
            biscuitsPerMonth += dailyProduction;
        }

        System.out.printf("You have produced %d biscuits for the past month.%n", biscuitsPerMonth);

        double diff = Math.abs(biscuitsPerMonth - countBiscuitsToCompare);
        double percent = (diff / countBiscuitsToCompare) * 100;

        if (biscuitsPerMonth >= countBiscuitsToCompare) {
            System.out.printf("You produce %.2f percent more biscuits.", percent);
        } else
            System.out.printf("You produce %.2f percent less biscuits.", percent);


    }
}
