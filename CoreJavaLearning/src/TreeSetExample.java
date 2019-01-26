import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String args[]) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("ABC");
        ts.add("String");
        ts.add("Bag");
        ts.add("Pen");
        ts.add("PEN");
        ts.add("Pen");

        System.out.println(ts);
    }
}