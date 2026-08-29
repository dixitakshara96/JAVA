package Code_Analysis.Task07;

public class Case_1 {

    public static void main(String[]args) {

        try {
            System.out.println("A");
            int x = 10/0;
            // Skipped the code written after this 😅 Point to be noted MyLord.
            System.out.println("B");

        }

        catch (ArithmeticException e) {
            System.out.println("C");
        }

        finally {
            System.out.println("D");
        }

        System.out.println("E");
    }
    
}
