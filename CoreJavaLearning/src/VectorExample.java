import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

    public static void main(String args[]) {

        Vector<String> v = new Vector<>();

        v.addElement("Apple");
        v.addElement("Orange");
        v.addElement("Mango");
        v.addElement("Fig");

        System.out.println("Size is: "+v.size());
        System.out.println("Default capacity increment is: "+v.capacity());

        v.addElement("something new");
        v.addElement("it's another");
        v.addElement("finally");

        System.out.println("Size after addition: "+v.size());
        System.out.println("Capacity after increment is: "+v.capacity());

        Enumeration en = v.elements();
        System.out.println("\nElements are:");
        while(en.hasMoreElements())
        System.out.print(en.nextElement() + ", ");
    }
}