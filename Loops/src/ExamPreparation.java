import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        int lowGrades = Integer.parseInt(scanner.nextLine());
        int counterLowGrades = 0;
        int sumAllGrades = 0;
        int counterAllProblems = 0;

        String lastProblem = "";

        String input = scanner.nextLine();
        while (!input.equals("Enough")){
            lastProblem = input;
            int currentGrade = Integer.parseInt(scanner.nextLine());
            sumAllGrades += currentGrade;
            counterAllProblems++;

            if (currentGrade <= 4) {
                counterLowGrades++;
                if (counterLowGrades == lowGrades){
                    break;
                }
            }
            input = scanner.nextLine();
        }
        double averageGrade = sumAllGrades * 1.0 / counterAllProblems;
        if (counterLowGrades == lowGrades){
            System.out.printf("You need a break, %d poor grades.", counterLowGrades);
        } else {
            System.out.printf("Average score: %.2f%n", averageGrade);
            System.out.printf("Number of problems: %d%n",counterAllProblems);
            System.out.println("Last problem: " + lastProblem);
        }
    }
}
