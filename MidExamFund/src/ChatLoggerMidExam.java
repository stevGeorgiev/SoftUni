import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ChatLoggerMidExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("end")) {
            switch (command[0]) {

                case "Chat":
                    list.add(command[1]);
                    break;

                case "Delete":
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).equals(command[1])) {
                            list.remove(command[1]);
                        }
                    }
                    break;


                case "Edit":
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).equals(command[1])) {
                            list.set(i, list.get(i).replace(command[1], command[2]));
                        }
                    }
                    break;


                case "Pin":
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).equals(command[1])) {
                            list.add(command[1]);
                            list.remove(command[1]);
                            break;
                        }
                    }
                    break;


                case "Spam":
                    list.addAll(Arrays.asList(command).subList(1, command.length));
                    break;
                default:
                    break;


            }
            command = scanner.nextLine().split(" ");


        }
        String chat = String.join(String.format("%n"),list);
        System.out.print(chat);
        }



    }

