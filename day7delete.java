import java.util.ArrayList;
import java.util.Scanner;

public class day7delete {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);
        list.add("learn");
        list.add("delete");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
        System.out.print("Enter task number to delete : ");
        int usernum = userInput.nextInt();
        userInput.nextLine();
        int index = usernum - 1;
        if (index >= 0 && index < list.size()) {
            list.remove(index);
            System.out.println("Task deleted !");
        } else {
            System.out.println("Invalid task number !");
        }
    }

}
