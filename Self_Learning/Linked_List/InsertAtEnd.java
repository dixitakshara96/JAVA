package Linked_List;
import java.util.Scanner;

public class InsertAtEnd {

    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static void insertAtEnd(int value) {

            Node temp = new Node(value);

            if (head == null) {
                head = temp;
                return;
            }

            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

                current.next = temp; 
    }

    static void traversing() {

        Node current = head;

        System.out.println();

        while (current != null ) {
            System.out.print(current.data + " -> " );
            current = current.next;
        }

        System.out.print("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\n---Linked List---");
            System.out.println("1. Insert");
            System.out.println("2. Traversing");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice) {

                case 1: 

                    System.out.print("Enter Value: ");
                    int value = sc.nextInt();
                    insertAtEnd(value);
                    break;

                case 2 :
                    traversing();
                    break;

                case 3 :
                    return;

                default: 
                    System.out.println("Invalid choice");
                    break;
                    
            }
        }
    }
}
