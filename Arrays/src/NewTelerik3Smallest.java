import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NewTelerik3Smallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> wordsAndSize = new LinkedHashMap<>();

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            String word = scanner.nextLine();
            int length = 0;
            for (int j = 0; j < word.length(); j++) {
                length += (int) word.charAt(j) - 96;
            }
            wordsAndSize.put(word, length);
        }

        String word = Collections.min(wordsAndSize.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
        System.out.println(wordsAndSize.get(word) + " " + word);

    }
}
