package Self_Learning;

public class Variable_Scope_Method {
    
    //  reason : because a and b khud uth kar nhi jaa rhi hai waha par 
    public static void main(String[] args) {
        int a = 30 ; int b = 45 ;
        
        System.out.println("\n---Before---");
        System.out.println("Value of a: " + a + "\nValue of b: " + b);

        swapFunction(a,b);
        System.out.println("\n---After---");
        System.out.println("Value of a: " + a + "\nValue of b: " + b);
    }

    public static void swapFunction( int x , int y ) {

        int z = x ;
        x = y ;
        y = z ;

        System.out.println("\n---Inside swapFunction---");
        System.out.println("Value of a: " + x + "\nValue of b: " + y);
    }
}
