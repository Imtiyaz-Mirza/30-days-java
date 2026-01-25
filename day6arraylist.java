import java.util.ArrayList;

public class day6arraylist {
    public static void main(String args[]) {
        ArrayList<String> List = new ArrayList<>();
        List.add("Happy Republic day !");
        List.add("Thank you !");
        List.add("Most welcome !");
        for (int i = 0; i < List.size(); i++) {
            System.out.println((i + 1) + " . " + List.get(i));
        }
    }
}
