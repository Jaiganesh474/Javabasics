package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteratorsDemo {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();

        // add elements to the array list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        // Use iterator to display contents of al
        System.out.println("Original contents of al: ");
        Iterator<String> itr = al.iterator();


        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element + " ");
        }
        System.out.println();
    }
}
