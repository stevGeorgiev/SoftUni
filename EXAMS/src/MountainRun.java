import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentRecord = Double.parseDouble(scanner.nextLine());
        double distanceMeter = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        double time1 = (distanceMeter * timePerMeter);
        double time2 = Math.floor(distanceMeter / 50) * 30;
        double totalTime = time1 + time2;

        if (totalTime < currentRecord){
            System.out.printf("Yes! The new record is %.2f seconds." , totalTime);
        } else {
            System.out.printf("No! He was %.2f seconds slower." , totalTime - currentRecord);
        }
    }
}
