package Linked_List;

public class NodeCreation {

    static class Node {
        int value; 
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        node1.next = node2;
        node2.next = node3;

        Node head = node1;

        Node current = head;

        while(current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
}
