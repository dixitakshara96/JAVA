package Day07;

public class AdvancePattern1 {

    public static void main(String[] args) {
        int rows = 5; // Change this value to print more rows

        for (int i = 1; i <= rows; i++) {
            // 1. Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // 2. Print counting up
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            // // 3. Print counting down
            // for (int j = i - 1; j >= 1; j--) {
            //     System.out.print(j);
            // }
            
            // Move to the next line
            System.out.println();
        }
    }
    
}
