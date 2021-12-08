import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < Math.min(firstNumbers.size(), secondNumbers.size()); i++) {
            System.out.print(firstNumbers.get(i) + " " + secondNumbers.get(i) + " ");

        }

        if (firstNumbers.size() > secondNumbers.size()){
            result.addAll(getRemainingElements(firstNumbers , secondNumbers));
        } else if (secondNumbers.size() > firstNumbers.size()){
            result.addAll(getRemainingElements(secondNumbers , firstNumbers));
        }

        System.out.println(result.toString().replaceAll("[\\[\\],]" , ""));

    }
    public static List<Integer>getRemainingElements (List<Integer> longerList , List<Integer> shorterList){
        List<Integer> numbers = new ArrayList<>();
        for (int i = shorterList.size(); i < longerList.size() ; i++) {
               numbers.add(longerList.get(i));
        }
return numbers;
    }
}
