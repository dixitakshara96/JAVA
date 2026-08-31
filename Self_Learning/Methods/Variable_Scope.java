package Self_Learning.Methods;

public class Variable_Scope {

    public static void main(String[]args) {
        int variable = 34;

        {   // this gonna through error as we can't re-initialize the same variable again inside a method  
            // int variable = 34; 
            variable = 19; // but can update the value of the variable (or re-define)
            System.out.println("Inside BLock: " + variable); // this gonna print the value of variable that is inside this block 
        }

        // Now in heap the variable reference is pointing towards 19 
        // jo humne block ke andar kiya s 
        System.out.println("Outside Block: "+ variable);
        

    }
    
}
