import java.io.IOException;

import Day07.TextIO;

public class Calculator { 
    public static void main(String[] args) { 
        while (true) { 
            System.out.println("\nEnter first no. :"); 
            double first = TextIO.getDouble(); 
            
            System.out.println("\nEnter second no. :"); 
            double second = TextIO.getDouble(); 
            
            System.out.println("\nEnter operator :"); 
            char operator = TextIO.getChar(); 
            
            if (first == 0) { 
                System.out.println("First Value Can't be 0"); 
                break; // Exits the loop and terminates the program if first number is 0
            } else { 
                try {
                    switch (operator) {
                        case '+': 
                            System.out.println("Sum : " + (first + second)); 
                            break; 
                        case '-': 
                            System.out.println("Difference : " + (first - second)); 
                            break; 
                        case '*': 
                            System.out.println("Product : " + (first * second)); 
                            break; 
                        case '/': 
                            if (second != 0) { 
                                System.out.println("Division : " + (first / second)); 
                            } else { 
                                throw new IllegalArgumentException("Can't divide value by 0"); 
                            } 
                            break;
                        default: 
                            throw new IllegalArgumentException("Invalid Operator: " + operator); 
                    } 
                } catch (IllegalArgumentException e) { 
                    // Prints the error message to the console instead of crashing the program
                    System.out.println("Error: " + e.getMessage()); 
                } 
            } 
        } 
    } 
}


    

