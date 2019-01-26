import java.util.Hashtable;
import java.util.Enumeration;

public class HashTableExample {

    public static void main(String[] args) {

        Enumeration names;
        String key;

        Hashtable<String, String> ht = new Hashtable<>();

        ht.put("Key1","Chaitanya");
        ht.put("Key2","Ajeet");
        ht.put("Key3","Peter");
        ht.put("Key4","Ricky");
        ht.put("Key5","Mona");

        names = ht.keys();
        while(names.hasMoreElements()) {
            key = (String) names.nextElement();
            System.out.println("Key: " +key+ " & Value: " +ht.get(key));
        }
    }
}