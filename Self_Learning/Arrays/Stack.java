package Arrays;
import java.util.Scanner;

public class Stack {

    static int[] array = new int[5];
    static int top = -1;

    static void push(int value) {
        if ( top == array.length) {
            System.out.println("Stack is OverFlow");
            return;
        }
        top++;
        array[top] = value;
        System.out.println("Inserted Successfully");
        
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack is UnderFlow");
            return;
        }
        System.out.println("Deleted" + array[top]);
        top--;
    }

    static void display() {
        for (int element : array) {
            System.out.println(element);
        }
    }

    static void peek() {
        System.out.println("Top Element: " + array[top]);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n---Stack Implementation---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch(choice) {

                case 1 : 
                    System.out.println("Insert value: ");
                    push(sc.nextInt());
                    break;

                case 2 :
                    pop();
                    break;

                case 3:
                    peek();
                    break;

                case 4 :
                    display();
                    break;

                case 5: 
                    return;

                default: 
                    System.out.println("invalid choice");
                    break;
            }
        }
    }
}
