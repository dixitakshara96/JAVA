package OOP_Basics;

public class Final {

    public static void main(String[]args) {
        // we defined the variable VAR using final keyword
        // It is a convention to write final variable in all Capital Letters 😊
        // we have to assign value to the final variale when it is declare (always initialize it).
        // because you can't modify it 
        final int VAR = 10;

        System.out.println("Final Variable: " + VAR);

        // below I will get an error because the final keyword means you can't change the value later in the program.
        // VAR = 23;
    }
    
}
