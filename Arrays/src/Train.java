import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        int [] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i]=scanner.nextInt();
        }

        int sum = 0;
        for ( int number :numbers) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.printf("%n%d" , sum);


        }


    }

