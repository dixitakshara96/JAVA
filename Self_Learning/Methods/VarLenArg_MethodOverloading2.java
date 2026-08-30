package Self_Learning.Methods;

import java.util.Arrays;

public class VarLenArg_MethodOverloading2 {

    public static void main(String[]args) {

    //     varLen();

    //     varLen();
    }

    static void varLen(int ...varArg) {
        System.out.println(Arrays.toString(varArg));
    }

    static void varLen(String ...varArg) {
        System.out.println(Arrays.toString(varArg));
    }
    
    // reference is ambigous 😁
}
