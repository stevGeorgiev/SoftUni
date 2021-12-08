import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        String sign = scanner.nextLine();
        double secondNumber = Double.parseDouble(scanner.nextLine());

        double sum = calculate(firstNumber , sign , secondNumber);
        System.out.printf("%.0f" , sum);


    }

    static double calculate(double firstNumber, String sign, double secondNumber) {
        double result = 0;

        switch (sign) {
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
        }
        return result;


    }

}
