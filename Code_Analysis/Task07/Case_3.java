package Code_Analysis.Task07;

public class Case_3 {

    public static void main(String[]args) {

        try {
            int x = 10 / 0;
        }

        catch (Exception e) {
            System.out.println("General");
        }
        // here is the issue 😁 
        
        catch (ArithmeticException e) {
            System.out.println("Arithmetic");
        }
    }
    
}
