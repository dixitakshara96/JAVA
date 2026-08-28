package Code_Analysis.Task07;

public class Case_7 {

    public static void main(String[]args) {

        try {

            System.out.println("Start");

            int x = 10 /0 ;

            System.out.println("Middle");
        }

        catch (ArithmeticException e) { 
            System.out.println("Caught");
        }

        System.out.println("End");
    }
    
}
