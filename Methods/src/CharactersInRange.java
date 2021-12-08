import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        getCharactersBetween(first , second);

    }

    static void getCharactersBetween(char first, char second) {
        if (first < second) {
            for (int ascii = first + 1; ascii <= second -1 ; ascii++) {
                System.out.print((char) ascii + " ");
            }
        } else {
            for (int ascii = second + 1; ascii <= first - 1 ; ascii++) {
                System.out.print((char) ascii + " ");
            }
        }
    }
}