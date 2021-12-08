import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (char one = 'a'; one < 'a' + n; one++) {
            for (char two = 'a'; two < 'a' + n; two++) {
                for (char three = 'a'; three < 'a' + n; three++) {
                    System.out.printf("%c%c%c%n" , one , two , three);
                }
            }
        }


    }
}
