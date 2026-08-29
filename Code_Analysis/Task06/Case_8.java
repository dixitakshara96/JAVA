package Code_Analysis.Task06;

public class Case_8 {

    public static void main(String[]args) {

        if (true) {
            int x = 100;
        }
        // This following code will through error because of Scope of the Variable and Definite Assignment
        // System.out.println(x);
    }
    
}
