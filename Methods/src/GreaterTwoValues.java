import java.util.Scanner;

public class GreaterTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfValue = scanner.nextLine();
        String firstThing = scanner.nextLine();
        String secondThing = scanner.nextLine();

        System.out.println(getMax(firstThing,secondThing));


    }

    static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }

    static int getMax(int firstNumber, int secondNumber) {
        return Math.max(firstNumber, secondNumber);
    }

    static char getMax(char first, char second) {
        if (first > second) {
            return first;
        }
        return second;
    }

}
