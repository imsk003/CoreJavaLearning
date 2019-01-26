import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    private static ArrayList<String> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String list = scanner.nextLine();
        addList(list);
    }
    static void addList(String list) {
        arrayList.add(list);
        System.out.println(list+" has been added into arraylist");
    }
}
