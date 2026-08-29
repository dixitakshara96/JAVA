package Code_Analysis;

public class Case_5 {

    public static void main(String[]args) {
        int x ;

        if (Math.random() > 0.5) {
            x = 10;
        }
        // This below line will through error because of definite assignment is necessary.
        // System.out.println(x);
    }
}
