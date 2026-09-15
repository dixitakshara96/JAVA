package Linked_List;
import java.util.Scanner;

public class InsertAtBeg {

    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static void insertAtBeginning(int value) {

            Node temp = new Node(value);

            if (head == null) {
                head = temp;
                return;
            }
                temp.next = head;
                head = temp;
    }

    static void traversing() {
        Node current = head;
        while (current != null ) {
            System.out.print(current.data + "->" );
            current = current.next;
        }
        System.err.print("null");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\n---Linked List---");
            System.out.println("1. Insert");
            System.out.println("2. Traversing");
            System.out.println("3. Exit");
            System.out.println("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice) {

                case 1: 

                    System.out.println("Enter Value: ");
                    int value = sc.nextInt();
                    insertAtBeginning(value);
                    break;

                case 2 :
                    traversing();
                    break;

                case 3 :
                    return;

                default: 
                    System.out.println("invalid choice");
                    break;
                    
            }
        }
    }
}
