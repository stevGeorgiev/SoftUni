import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeSum = 0;
        int nonPrimeSum = 0;

        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            boolean isPrime = true;
            int temp;
            int numb = Integer.parseInt(input);
            if (numb < 0) {
                input = scanner.nextLine();
                System.out.println("Number is negative.");
                continue;
            }
            for (int i = 2; i <= numb / 2 ; i++) {
                temp = numb % i;
                if (temp == 0){
                    isPrime = false;
                    break;
                }
            }
             if ( isPrime ) {
                 primeSum += numb;
             } else {
                 nonPrimeSum += numb;
             }
             input = scanner.nextLine();


        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d" , nonPrimeSum);
    }
}


