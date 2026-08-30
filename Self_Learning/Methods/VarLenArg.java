package Self_Learning.Methods;
import java.util.Arrays;
import java.util.Scanner;

public class VarLenArg {

    public static void main(String[]args) {

        VarArg(23, 34, 54, 42, 69, 78);
    }

    static void VarArg(int ...varArg) {
        System.out.println(Arrays.toString(varArg)) ;
    }
    
}
