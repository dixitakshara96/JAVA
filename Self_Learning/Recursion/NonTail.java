package Recursion;
import java.util.Scanner;

public class NonTail {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();

        System.out.println("\n---Printing---");
        nonTail(num);
    }
    
    static void nonTail(int n) {
        
        if (n > 0) {
            nonTail(n-1);
            System.out.println(n);
        }
    }
    
}
