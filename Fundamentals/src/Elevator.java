import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double people = Integer.parseInt(scanner.nextLine());
        double capacity = Integer.parseInt(scanner.nextLine());

        double courses = people / capacity;

        System.out.printf("%.0f" , Math.ceil(courses));



    }
}
