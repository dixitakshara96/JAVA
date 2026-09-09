package Recursion;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter position: ");
        int position = sc.nextInt();

        System.out.println("Value at " + position + " in Fibonacci Series is " + fibonacci(position));
    }

    static int fibonacci(int index) {

        if ( index == 0 || index == 1 ) 
            return index;

        return ( fibonacci(index - 1) + fibonacci(index - 2) ) ;
    }
    
}

// this is an example of Non Linear Recursion