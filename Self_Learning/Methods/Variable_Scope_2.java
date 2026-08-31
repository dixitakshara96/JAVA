package Self_Learning.Methods;

public class Variable_Scope_2 {

    public static void main(String[]args) {
        int variable1 = 45;

        {   // you can initialize a variable inside a block if it was not initialized before

            int variable2 = 39;
            System.out.println("Inside BLock  (variable 2): " + variable2 );

            System.out.println("Inside Block (variable1): "+ variable1);
        }

        // you can't access a variable which is initialized inside the inner block but not initialized outside that the block
        // it's like WHO ARE U?
        // variable2 = 57;

        // you can re-initialize a variable outside the block either it is initialized inside the inner block or not.
        int variable2 = 24;
        System.out.println("Outside Block (variable2): " + variable2);
    }
    
}
