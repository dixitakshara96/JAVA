package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class First {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // collection of Datatypes
        
        int[] array = new int[5];

        int[] array1 = {23, 16, 52, 43, 69};
        
        System.out.println(array[0]);

        // LHS is the reference variable (stack)
        // RHS is the object (heap)
        // Null is a special value literal for reference variable point to in memory for Non Primitives

        int[] array3; // Compile Time
        array3 = new int[6]; // Runtime 

        for (int i = 0 ; i < array3.length ; i++) {
            System.out.println("Enter element: ");
            array3[i] = sc.nextInt();
        }

        for (int element : array3) {
            System.out.print(element + " ");
        }

        System.out.println("\n"+ Arrays.toString(array1));
    }
    
}
