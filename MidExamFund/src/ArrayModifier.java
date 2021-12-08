import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split("\\s+");

            switch (command[0]) {
                case "swap":
                    int swapFirstIndex = Integer.parseInt(command[1]);
                    int swapSecondIndex = Integer.parseInt(command[2]);
                    Collections.swap(numbers, swapFirstIndex, swapSecondIndex);
                    break;

                case "multiply":
                    int firstMulti = Integer.parseInt(command[1]);
                    int secondMulti = Integer.parseInt(command[2]);
                    numbers.set(firstMulti,numbers.get(firstMulti) * numbers.get(secondMulti));
                    break;

                case "decrease":
                    IntStream.range(0, numbers.size()).forEach(e -> numbers.set(e, numbers.get(e) - 1));
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.println(Arrays.toString(new List[] {numbers}).replaceAll("[\\[\\]]" , ""));

    }
}
