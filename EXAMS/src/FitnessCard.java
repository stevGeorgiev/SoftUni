import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cashInMe = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double sum1 = 0;


        switch (sport) {
            case "Gym":
                if (gender.equals("m")) {
                    sum1 = 42;
                } else if (gender.equals("f")) {
                    sum1 = 35;
                }
                break;
            case "Boxing":
                if (gender.equals("m")) {
                    sum1 = 41;
                } else if (gender.equals("f")) {
                    sum1 = 37;
                }
                break;
            case "Yoga":
                if (gender.equals("m")) {
                    sum1 = 45;
                } else if (gender.equals("f")) {
                    sum1 = 42;
                }
                break;
            case "Zumba":
                if (gender.equals("m")) {
                    sum1 = 34;
                } else if (gender.equals("f")) {
                    sum1 = 31;
                }
                break;
            case "Dances":
                if (gender.equals("m")) {
                    sum1 = 51;
                } else if (gender.equals("f")) {
                    sum1 = 53;
                }
                break;
            case "Pilates":
                if (gender.equals("m")) {
                    sum1 = 39;
                } else if (gender.equals("f")) {
                    sum1 = 37;
                }
                break;

        }
        if (age <= 19) {
            sum1 = sum1 - sum1 * 0.20;
        }

           double diff = sum1 - cashInMe;
        if (cashInMe >= sum1) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more." , diff);
        }
    }
}
