public class TypeConversion {

    public static void main(String[] args) {

        int a = 10;
        float b = 3.9f;
        // Implicit Widening
        System.out.println(a + b) ;

        // Explicit Narrowing
        int c = (int) b;

        System.out.println(c);
    }

    // Compiler humesha widening karta hai kuch se kabhi narrowing nhi karega
    
}
