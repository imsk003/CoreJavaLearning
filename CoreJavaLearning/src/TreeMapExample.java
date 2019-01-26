import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String args[]) {

    TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(1, "Data1");
        tm.put(23, "Data2");
        tm.put(70, "Data3");
        tm.put(4, "Data4");
        tm.put(2, "Data5");

        Set set = tm.entrySet();
        for (Object aSet : set) {
            Map.Entry mentry = (Map.Entry) aSet;
            System.out.print("key is: " + mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }

    }
}