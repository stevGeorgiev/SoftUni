import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] array1 = new String[n];
        String[] array2 = new String[n];

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split(" ");

            String firstElement = input[0];
            String secondElement = input[1];

            if ((i + 1) % 2 == 0) {
                array2[i] = firstElement;
                array1[i] = secondElement;
            } else {
                array2[i] = secondElement;
                array1[i] = firstElement;
            }
        }

        System.out.println(String.join(" ", array1));
        System.out.println(String.join(" ", array2));


    }
}