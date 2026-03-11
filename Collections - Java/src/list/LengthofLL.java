package list;

class NodeLL {
    int data;
    NodeLL next;

    // Constructor to initialize a new node with data
    NodeLL(int newData) {
        data = newData;
        next = null;
    }
}

// Class to define methods related to the linked list
public class LengthofLL {

    // Counts number of nodes in linked list
    public static int countNodes(NodeLL head) {

        // Initialize count with 0
        int count = 0;

        // Initialize curr with head of Linked List
        NodeLL curr = head;

        // Traverse till we reach null
        while (curr != null) {

            // Increment count by 1
            count++;

            // Move pointer to next node
            curr = curr.next;
        }
        // Return the count of nodes
        return count;
    }

    static void printList(NodeLL head) {

        // A loop that runs till head is null
        while (head != null) {

            // Printing data of current node
            System.out.print(head.data);
            if(head.next!=null)
                System.out.print("->");

            // Moving to the next node
            head = head.next;
        }
    }

    // Driver code
    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 1 -> 3 -> 1 -> 2 -> 1
        NodeLL head = new NodeLL(1);
        head.next = new NodeLL(3);
        head.next.next = new NodeLL(1);
        head.next.next.next = new NodeLL(2);
        head.next.next.next.next = new NodeLL(1);

        // Function call to count the number of nodes
        System.out.println("Count of nodes is "
                + countNodes(head));

        printList(head);
    }
}