import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] command = input.split(" ");
            int index = Integer.parseInt(command[1]);

            switch (command[0]) {

                case "Shoot":
                    int power = Integer.parseInt(command[2]);
                    if (index >= 0 && index < list.size()) {
                        list.set(index, list.get(index) - power);

                        if (list.get(index) <= 0) {
                            list.remove(index);
                        }
                    }
                    break;
                case "Add":
                    int value = Integer.parseInt(command[2]);
                    if (index >= 0 && index < list.size()) {
                        list.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int radius = Integer.parseInt(command[2]);
                    if (index >= 0 && index < list.size() && (0 <= index - radius && index + radius < list.size())) {
                        for (int i = index + radius; i >= index - radius; i--) {
                            list.remove(i);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        printArray(list, "|");
    }

    public static void printArray(List<Integer> list, String separator) {
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 1) {
                System.out.print(list.get(i) + separator);
            } else {
                System.out.print(list.get(i));
            }

        }
    }
}

