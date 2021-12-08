import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class SoftUniReceipt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int firstTeacherPerHour = Integer.parseInt(scanner.nextLine());
        int secondTeacherPerHour = Integer.parseInt(scanner.nextLine());
        int thirdTeacherPerHour = Integer.parseInt(scanner.nextLine());

        int countStudentsQuestions = Integer.parseInt(scanner.nextLine());

        int answersPerHour = firstTeacherPerHour + secondTeacherPerHour + thirdTeacherPerHour;
        int counterHours = 0;


        while (countStudentsQuestions > 0) {
            countStudentsQuestions -= answersPerHour;
            counterHours++;

            if (counterHours % 4 == 0){
                counterHours++;

            }
        }
        System.out.println("Time needed: " + counterHours + "h.");

    }
}
