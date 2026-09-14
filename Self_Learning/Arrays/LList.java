package Arrays;

// Linked List
public class LList {

    // blueprint to create a Node which initially has value and address of next node
    // ek new file LList$Node.class ban gyi hai 
    static class Node {
        int data;
        Node next; // doubt

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        node1.next = node2;
        node2.next = node3;

        // we only have access of first node
        Node head = node1;

        // this we are using for iteration
        Node current = node1;

        while (current != null) {
            System.out.print(current.data + " -> ");
            // hum node.data print karne ke baad apne reference variable "current" ko aage
            // wale node ki taraf shift kara denge .
            current = current.next;
        }
        System.out.print("null");
    }
}
