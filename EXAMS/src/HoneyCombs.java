import java.util.Scanner;

public class HoneyCombs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBees = Integer.parseInt(scanner.nextLine());
        int countFlowers = Integer.parseInt(scanner.nextLine());

        double gramsPerFlower = 0.21;


        double honeyMade = countBees * countFlowers * gramsPerFlower;
        double filledCombs = Math.floor(honeyMade / 100);
        double difference = honeyMade - filledCombs * 100;


        System.out.printf("%.0f honeycombs filled.%n" , filledCombs);
        System.out.printf("%.2f grams of honey left." , difference);
    }
}