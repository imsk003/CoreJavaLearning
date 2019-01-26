import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String args[]) {

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(12, "Ram");
        hm.put(2, "Raja");
        hm.put(7, "Suresh");
        hm.put(49, "Ajith");
        hm.put(3, "SK");

        Set set = hm.entrySet();
        for (Object aSet : set) {
            Map.Entry mentry = (Map.Entry) aSet;
            System.out.print("key is: " + mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }

        String var= hm.get(3);
        System.out.println("Value at index 3 is: "+var);
    }
}