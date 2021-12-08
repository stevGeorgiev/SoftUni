import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countKegs = Integer.parseInt(scanner.nextLine());
        double maxVolume = Double.MIN_VALUE;
        String maxKeg = "";


        for (int keg = 1; keg <= countKegs ; keg++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius , 2) * height;

            if (volume > maxVolume){
                maxKeg = model;
                maxVolume = volume;

            }


            
        }
        System.out.println(maxKeg);

    }
}
