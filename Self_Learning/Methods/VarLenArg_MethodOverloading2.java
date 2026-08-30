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
    // why is this ambigous yeh bhi toh likh do devi ji
    // khair push on github after every new concept 
    // so that you can come back and revise it using commit history not by the files
}
