import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.addLast("C");
        linkedList.addFirst("D");
        linkedList.add(2, "E");
        linkedList.add("F");
        linkedList.add("G");
        System.out.println("Linked list : " + linkedList);

        linkedList.remove("B");
        linkedList.remove(3);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Linked list after deletion: " + linkedList);

        boolean status = linkedList.contains("E");

        if(status)
            System.out.println("List contains the element 'E' ");
        else
            System.out.println("List doesn't contain the element 'E'");

        int size = linkedList.size();
        System.out.println("Size of linked list = " + size);

        Object element = linkedList.get(2);
        System.out.println("Element returned by get() : " + element);
        linkedList.set(2, "Y");
        System.out.println("Linked list after change : " + linkedList);
    }
}
