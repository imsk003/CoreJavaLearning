import java.util.HashSet;

public class HashSetExample {
    public static void main(String args[]) {

        HashSet<String> hs = new HashSet<>();

        hs.add("Apple");
        hs.add("Mango");
        hs.add("Grapes");
        hs.add("Orange");
        hs.add("Fig");
        hs.add("Apple");
        hs.add("Mango");
        hs.add(null);
        hs.add(null);

        System.out.println(hs);
    }
}