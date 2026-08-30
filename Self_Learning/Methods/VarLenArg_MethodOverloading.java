package Self_Learning.Methods;

import java.util.Arrays;

public class VarLenArg_MethodOverloading {

    public static void main(String[]args) {

        varLenArg(23, 35, 52, 63, 73);

        varLenArg("Ram", "Shyam", "Sita", "Radha", "Shiv", "Shakti");

    }

    static void varLenArg(int ...varArg) {
        System.out.println(Arrays.toString(varArg));
    }

    static void varLenArg(String ...varArg) {
        System.out.println(Arrays.toString(varArg));
    }
    
}
