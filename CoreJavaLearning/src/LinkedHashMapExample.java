import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {
    public static void main(String args[]) {

        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

        lhm.put(22, "Abey");
        lhm.put(33, "Dawn");
        lhm.put(1, "Sherry");
        lhm.put(2, "Karon");
        lhm.put(100, "Jim");

        Set set = lhm.entrySet();

        for (Object aSet : set) {
            Map.Entry me = (Map.Entry) aSet;
            System.out.print("Key is: " + me.getKey() + "& Value is: " + me.getValue() + "\n");
        }
    }
}