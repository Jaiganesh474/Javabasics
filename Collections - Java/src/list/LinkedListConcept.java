package list;

import java.util.LinkedList;

public class LinkedListConcept {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add(10);
        linkedList.add(20);

        // Adding an element at the first position
        linkedList.addFirst(5);
        // Adding an element at the second position
        linkedList.add(1, 15);
        // Adding an element at the last position
        linkedList.addLast(30);
        //Deleting an element
        linkedList.remove(2); // Removes the element at index 2
        // Displaying the LinkedList
        System.out.println("LinkedList Elements: " + linkedList);
    }
}
