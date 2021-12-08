import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoinNumber = Integer.parseInt(scanner.nextLine());
        double chineseUanNumber = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

       double bitcoinLev = 1168;
       double chineseUanDollar = 0.15;
       double dollarLev = 1.76;
       double euroLev = 1.95;
       double commissionN = commission /100;

       double sum1 = (bitcoinNumber * bitcoinLev) + (chineseUanNumber * chineseUanDollar * dollarLev);
       double sum2 = sum1 / euroLev;
       double sum3commission = sum2 * commissionN;
       double result = sum2 - sum3commission;

        System.out.printf("%.2f" , result);






    }
}
