import java.util.Scanner;

public class PrimeTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 1; i <= input; i++) {
            if(isPrime(i)){
                for (int j = 1;j <= i;j++ ){
                    int booleanAsDigit = isPrime(j)? 1:0;
                    System.out.print(booleanAsDigit);
                }
                System.out.println();
            }
        }
    }

    public static boolean isPrime(int isPrime) {
        boolean testNumber = true;
        for (int divisor = 2; divisor <= isPrime / 2; divisor++) {
            if (isPrime % divisor == 0) {
                testNumber = false;
                break;
            }
        }
        return testNumber;
    }
}
