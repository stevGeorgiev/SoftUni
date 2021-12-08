import java.util.Scanner;

public class CombineLists {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        String firstList = scanner.nextLine();
        String[] array1 = firstList.split(",");

        String secondList = scanner.nextLine();
        String[] array2 = secondList.split(",");

        String[] newString = new String[array1.length + array2.length];
        for (int j = 0, a = 0; j < newString.length; j = j + 2, a++) {
            newString[j] = array1[a];
        }
        for (int b = 1, c = 0; b < newString.length; b = b + 2, c++) {
            newString[b] = array2[c];
        }
        System.out.println(String.join(",", newString));
    }
}