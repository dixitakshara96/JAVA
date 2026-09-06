package Recursion;
import java.util.Scanner;

public class Tail {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("\n---Reverse---");
        tailRecursion(num);
    }

    static void tailRecursion(int n) {
        if (n > 0) {
            System.out.println(n);
            tailRecursion(n-1);
        }
    } 

}
