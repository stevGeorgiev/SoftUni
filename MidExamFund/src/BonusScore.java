import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        int countLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = 0;
        int maxAttendance = 0;

        for (int i = 0; i < countStudents; i++) {
            int attendOfEachStudent = Integer.parseInt(scanner.nextLine());

            double totalBonus = (attendOfEachStudent * 1.0 / countLectures) * (5 + additionalBonus);

            if (maxBonus < totalBonus) {
                maxBonus = totalBonus;
                maxAttendance = attendOfEachStudent;

            }
        }

        System.out.printf("Max Bonus: %.0f.%n" , Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures." , maxAttendance);


    }


}

