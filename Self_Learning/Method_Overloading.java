package Self_Learning;

public class Method_Overloading {

    public static void myMethod( int a , int b) {
        System.out.println("a + b using myMethod 1st = "+ (a+b));   
    }

    public static void myMethod( double a , double b) {
        System.out.println("a + b using myMethod 2nd= "+ (a+b));   
    }
    public static void main(String[] args) {

        myMethod(2 , 7);

        myMethod(2.5,7.3);
    }
    
}
