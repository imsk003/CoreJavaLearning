import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String args[]) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Z");
        lhs.add("PQ");
        lhs.add("N");
        lhs.add("O");
        lhs.add("KK");
        lhs.add("Z");
        System.out.println(lhs);

        LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>();

        lhs2.add(99);
        lhs2.add(7);
        lhs2.add(0);
        lhs2.add(67);
        lhs2.add(89);
        lhs2.add(67);
        System.out.println(lhs2);
    }
}