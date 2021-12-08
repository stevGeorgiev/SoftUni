import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favouriteBook = scanner.nextLine();
        int counter = 0;


        String currentBook = scanner.nextLine();
        while (!currentBook.equals("No More Books")) {


            if (currentBook.equals(favouriteBook)) {
                break;
            }
            counter++;


            currentBook = scanner.nextLine();
        }
        if (currentBook.equals(favouriteBook)) {
            System.out.printf("You checked %d books and found it.", counter);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", counter);
        }
    }
}
