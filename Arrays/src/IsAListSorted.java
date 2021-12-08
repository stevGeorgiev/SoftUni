import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.stream.Collectors;

public class IsAListSorted {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {

            String[] line = scanner.nextLine().split(",");

            List<Integer> firstIntegerList;
            List<Integer> secondIntegerList;

            firstIntegerList = Arrays.stream(line).map(Integer::parseInt).collect(Collectors.toList());
            secondIntegerList = Arrays.stream(line).map(Integer::parseInt).collect(Collectors.toList());

            Collections.sort(firstIntegerList);

            if (firstIntegerList.equals(secondIntegerList)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
