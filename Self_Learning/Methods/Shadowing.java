package Self_Learning.Methods;

public class Shadowing {

    // class variable
    static int variable = 99; 

    public static void main(String[]args) {

        System.out.println("Before: " + variable);

        int variable = 45; // local variable Shadowing the class variable

        System.out.println("After: " + variable);

        System.out.print("Inside func() : ");
        func();
    }

    static void func() {
        System.out.print(variable); // class variable 
    }
    
}
