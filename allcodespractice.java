import java.util.Scanner;
import java.util.ArrayList;

public class allcodespractice {
    static ArrayList<String> list = new ArrayList<>();

    static void addTask(String taskName) {
        list.add(taskName);
        System.out.println("Your task has been added !");
    }

    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter 5 tasks !");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Task" + i + ": ");
            String task = userInput.nextLine();
            addTask(task);

        }
        System.out.println("Your tasks are : ");
        System.out.println(list);
        userInput.close();
    }
}