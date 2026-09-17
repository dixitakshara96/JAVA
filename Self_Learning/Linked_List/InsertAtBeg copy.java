package Linked_List;
import java.util.Scanner;

public class InsertAtBeg {

    // Creating Node (separately)
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // this is use to handle the initial condition when there is no node exists
    static Node head = null;

    // now comes the actual method
    static void insertAtBeginning(int value) {

            // created the node temp
            Node temp = new Node(value);

            // just initial condition when there is no node exist so we create the first node
            if (head == null) {
                head = temp;
                return;
            }
                // Now storing the address of head into temp.next actual insertion at beg
                temp.next = head;

                // now temp is the first node actually so now head will point to temp (1st node)
                head = temp;
    }

    static void traversing() {
        Node current = head;
        System.out.println();
        while (current != null ) {
            System.out.print(current.data + " -> " );
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
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice) {

                case 1: 

                    System.out.print("Enter Value: ");
                    int value = sc.nextInt();
                    insertAtBeginning(value);
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
