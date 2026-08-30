package Self_Learning.Methods;
import java.util.Scanner;

public class Swap_Magic {

    public static void main(String[]args) {

        // User se input lene ke liye Scanner ka object banaya
        Scanner sc = new Scanner(System.in);

        // Pehla number input lene ke liye
        System.out.print("Enter first: ");
        int arg1 = sc.nextInt(); // User jo value dega wo arg1 me store hogi

        // Dusra number input lene ke liye
        System.out.print("Enter second: ");
        int arg2 = sc.nextInt(); // User jo value dega wo arg2 me store hogi

        // Swap karne se pehle main() ke andar ki original values print kar rahe hain
        System.out.println("\nBefore Method");
        System.out.println("First: " + arg1 + "\tSecond: " + arg2);

        // Method call: Yahan arg1 aur arg2 ki COPY pass ho rahi hai (Pass-by-Value)
        swapMethod( arg1, arg2);

        // Method khatam hone ke baad check kar rahe hain ki kya main() ki values me farak pada
        // (Spoiler: Main me values original hi rahengi)
        System.out.println("\nAfter Method");
        System.out.println("First: " + arg1 + "\tSecond: " + arg2);
    }

    // Yeh method 2 parameters (para1, para2) accept karta hai
    static void swapMethod( int para1 , int para2) {
        // Swapping Logic (Temporary variable ka use karke)
        int temp = para1; // 1. para1 ki value temp me safe kar li
        para1 = para2;    // 2. para2 ki value para1 me daal di
        para2 = temp;     // 3. temp (yani purana para1) para2 me daal diya

        // Ab values swap ho chuki hain, lekin SIRF is method ke local variables (para1, para2) me
        System.out.println("\nInside Method");
        System.out.println("First: " + para1 + "\tSecond: " + para2);
    }    
}
