import java.util.Scanner;

public class HoneyWinterReserves {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double honeyForWinter = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();
        String nextLine = "0";

        int monthCounter = 0;
        double beeHoneyTotal = 0;
        double totalHoney = 0;
        double newHoney = 0;

        while (!name.equals("Winter has come")) {
            while (monthCounter < 6){
                monthCounter++;
                newHoney = Double.parseDouble(scanner.nextLine());
                beeHoneyTotal = beeHoneyTotal + newHoney;
            }
            totalHoney = totalHoney + beeHoneyTotal;
            if (beeHoneyTotal < 0){
                System.out.printf("%s was banished for gluttony%n" , name);
            }
            if (totalHoney >= honeyForWinter){
                break;
            }
            monthCounter = 0;
            beeHoneyTotal = 0;
            name = scanner.nextLine();
        }
        if (totalHoney >= honeyForWinter){
            System.out.printf("Well done! Honey surplus %.2f." , totalHoney - honeyForWinter);
        }
        if (totalHoney < honeyForWinter){
            System.out.printf("Hard Winter! Honey needed %.2f.", honeyForWinter - totalHoney);
        }

    }
}
