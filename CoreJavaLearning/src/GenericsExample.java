import java.util.ArrayList;

public class GenericsExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        print(arrayList);
    }

    private static void print(ArrayList<Integer> arrayList) {
        for (int i : arrayList) {
            System.out.println(i);
        }
    }
}
