package Self_Learning.Linked_List;
import java.util.Scanner;

// public class DoubleyLL {

//     class static Node {

//         int value;
//         Node prev;
//         Node next;

//         public Node(int value) {
//             this.value = value;
//             this.prev = null;
//             this.next = null;
//         }
//     }

//     static Node head = null;
//     public static void insertAtBeg(int value) {
//         Node temp = new Node(value);
//         Node current = head;
//         if (head == null) {
//             head = temp;
//             System.out.println("Node Inserted !");
//         }
//         else if (head != null ){
//             temp.next = head;
//             head.prev = temp;
//             head = temp;
//             System.out.println("Node Inserted At Beginning !");
//         }
//     }
//     public static void insertAtEnd(int value) {
//         Node temp = new Node(value);
//         Node current = head;
//         if (head == null) {
//             head = temp;
//             System.out.println("Node Inserted !");
//         }
//         else if (head != null) {
//             while( current.next != null) {
//                 current = current.next;
//             }
//             current.next = temp;
//             temp.prev = current;
//             System.out.println("Node Inserted At End !");
//         }
//     }
//     public static void insertAtPosition (int value, int position) {
//         Node temp = new Node(value);
//         Node current = head;
//         Node previous = head;
//         if (head == null) {
//             head = temp;
//             System.out.println("Node Inserted !");
//         }
//         else if (head != null) {
//             while(position >= 0) {
//                 previous = current;
//                 current = current.next;
//                 position-- ;
//             }
//             if (previous != null) {
//                 temp.next = current;
//                 temp.prev = previous;
//                 current.prev = temp;
//                 previous.next = temp;
//                 System.out.println("Node Inserted At Position" + position + " !");
//             }
//             else {
//                 System.out.println("Can't insert at Positon");
//             }
            
//         }
//     }
//     public static void displayLL() {
//         Node current = head ;
//         if (head == null) {
//             System.out.println("Linked List is Empty!");
//         }
//         else {
//             while(current.next != null) {
//                 System.out.println(current + " -> ");
//                 current = current.next;
//             }
//             System.out.println(current);
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("\n---Linked List---");
//         System.out.println("1. Insert at Beginning");
//         System.out.println("2. Insert At the end");
//         System.out.println("3. Insert at a specific postion");
//         System.out.println("4. Traversing ");
//         System.out.println("5. Exit");
//         System.out.println("Enter choice: ");
//         int choice = sc.nextInt();
//         switch(choice) {
//             case 1: 
//                 System.out.println("Enter Value: ");
//                 int value = sc.nextInt();
//                 insertAtBeg(value);
//                 break;
//             case 2 :
//                 System.out.println("Enter Value: ");
//                 value = sc.nextInt();
//                 insertAtEnd(value);
//                 break;
//             case 3 :
//                 System.out.println("Enter Value: ");
//                 System.out.println("Enter positon: ");
//                 value = sc.nextInt();
//                 int position= sc.nextInt();
//                 insertAtPosition(value, position);
//                 break;
//             case 4 : 
//                 displayLL();
//                 break;
//             case 5: 
//                 return ;
//             default: 
//                 System.out.println("invalid choice");
//                 break;
                
//     }
        
//     }
// }

public class DoubleyLL {

    static class Node {
        int value;
        Node prev;
        Node next;

        Node(int value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }

    static Node head = null;

    public static void insertAtBeg(int value) {
        Node temp = new Node(value);

        if (head == null) {
            head = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }

        System.out.println("Node inserted!");
    }

    public static void insertAtEnd(int value) {
        Node temp = new Node(value);

        if (head == null) {
            head = temp;
            System.out.println("Node inserted!");
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = temp;
        temp.prev = current;

        System.out.println("Node inserted at end!");
    }

    public static void displayLL() {
        if (head == null) {
            System.out.println("Linked List is Empty!");
            return;
        }

        Node current = head;

        while (current != null) {
            System.out.print(current.value + " <-> ");
            current = current.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n---Linked List---");
        System.out.println("1. Insert at Beginning");
        System.out.println("2. Insert At the end");
        // System.out.println("3. Insert at a specific postion");
        System.out.println("4. Traversing ");
        System.out.println("5. Exit");
        System.out.println("Enter choice: ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1: 
                System.out.println("Enter Value: ");
                int value = sc.nextInt();
                insertAtBeg(value);
                break;
            case 2 :
                System.out.println("Enter Value: ");
                value = sc.nextInt();
                insertAtEnd(value);
                break;
            // case 3 :
            //     System.out.println("Enter Value: ");
            //     System.out.println("Enter positon: ");
            //     value = sc.nextInt();
            //     int position= sc.nextInt();
            //     insertAtPosition(value, position);
                // break;
            case 4 : 
                displayLL();
                break;
            case 5: 
                return ;
            default: 
                System.out.println("invalid choice");
                break;
                
    
        }
    }
}
    

