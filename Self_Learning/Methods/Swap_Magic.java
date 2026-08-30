package Self_Learning.Methods;
import java.util.Scanner;

public class Swap_Magic {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first: ");
        int arg1 = sc.nextInt();

        System.out.print("Enter second: ");
        int arg2 = sc.nextInt();

        System.out.println("\nBefore Method");
        System.out.println("First: " + arg1 + "\tSecond: " + arg2);

        swapMethod( arg1, arg2);

        System.out.println("\nAfter Method");
        System.out.println("First: " + arg1 + "\tSecond: " + arg2);
    }

    // important and simple program to show what actually happens internally

    static void swapMethod( int para1 , int para2) {
        int temp = para1;
        para1 = para2;
        para2 = temp;

        System.out.println("\nInside Method");
        System.out.println("First: " + para1 + "\tSecond: " + para2);
    }    
}
