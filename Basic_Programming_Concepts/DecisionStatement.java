package Basic_Programming_Concepts;

import java.util.Scanner;

public class DecisionStatement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1 :
                System.out.println("Decision Path 1");
            case 2 :
                System.out.println("Decision Path 2");
                // continue; this going to give compile time error (DecisionStatement error)
            case 3 :
                System.out.println("Decision Path 3");
            default :
                System.out.println("Default Decision Path");
        }
    }
}

// notes :
// switch - case statement is Decision Statement whereas if - else is conditional Statement
// in switch case jo hum variable switch ko dete hai as parameter that must be numeric type 
// break : is important in switch case and only break is used not continue
