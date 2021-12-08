import java.util.*;

class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int sum = 0;

        do {
            sum = 0;
            char[] charNumber = input.toCharArray();
            for (char c : charNumber) {
                if (c == 45) continue;
                if (c == 46) continue;
                sum += c - '0';
            }
            if (sum < 10) {
                System.out.println(sum);
            }
            input = Integer.toString(sum);
        } while (sum > 9);
    }
}