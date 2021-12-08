import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        String newString = repeatString(string, count);
        System.out.println(newString);


    }

    public static String repeatString(String string, int count) {
        return new String(new char[count]).replace("\0", string);

    }

}