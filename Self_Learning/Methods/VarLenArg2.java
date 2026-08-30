package Self_Learning.Methods;

import java.util.Arrays;

public class VarLenArg2 {

    public static void main(String[]args) {

        varLen();
    }

    static void varLen(int ...varArg) {
        System.out.println(Arrays.toString(varArg));
    }
    
}
