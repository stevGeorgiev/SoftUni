import java.util.Scanner;

public class HoneyWinterReserves2 {
    public static void main(String[] args) {

        double neededhoney;
        double totalhoney;
        try (Scanner scan = new Scanner(System.in)) {
            neededhoney = Double.parseDouble(scan.nextLine());
            String beename = scan.nextLine();
            String nextline = "0";
            int monthcount = 0;
            double beetotalhoney = 0;
            totalhoney = 0;
            double newhoney = 0;

            while (!beename.equals("Winter has come")) {
                while (monthcount < 6) {
                    monthcount++;
                    newhoney = Double.parseDouble(scan.nextLine());
                    beetotalhoney = beetotalhoney + newhoney;
                }
                totalhoney = totalhoney + beetotalhoney;
                if (beetotalhoney < 0) {
                    System.out.printf("%s was banished for gluttony%n", beename);
                }
                if (totalhoney >= neededhoney) {
                    break;
                }
                monthcount = 0;
                beetotalhoney = 0;
                beename = scan.nextLine();
            }
        }
        if (totalhoney >= neededhoney){
            System.out.printf("Well done! Honey surplus %.2f.", totalhoney - neededhoney);
        }
        if (totalhoney < neededhoney){
            System.out.printf("Hard Winter! Honey needed %.2f.", neededhoney - totalhoney);
        }
    }
}
