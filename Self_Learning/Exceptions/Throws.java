package Self_Learning.Exceptions;

class Calculator {

    void divide(int a , int b) //throws ArithmeticException
    {
        System.out.println("Dividing: " + (a/b));
    }
}

public class Throws {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();

        try {
            c1.divide(4,0);
        }
        catch(ArithmeticException e) {
            e.printStackTrace();
        }
        
        System.out.println("Bye Bye!");
    }
    
}
