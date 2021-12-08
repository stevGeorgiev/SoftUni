import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int diff = 0;
        int sum = 0;
        int sum2;


        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum = sum + num;


        }
        for (int i = 0; i < n; i++) {
            int num2 = Integer.parseInt(scanner.nextLine());
            diff = diff + num2;

        }
        if (sum == diff) {
            System.out.printf("Yes, sum = %d", sum);
        } else {
            sum2 = sum - diff;
            System.out.printf("No, diff = %d", Math.abs(sum2));
        }


    }

}