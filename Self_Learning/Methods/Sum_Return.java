package Self_Learning.Methods;
import java.util.Scanner;

public class Sum_Return {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first: ");
        int arg1 = sc.nextInt();

        System.out.print("Enter second: ");
        int arg2 = sc.nextInt();

        // Method Call 
        // arg1 and arg2 are the Arguments aka Actual Parameters
        int add = methodSum(arg1, arg2) ;

        System.out.println("Sum: " + add);
    }

    // Method Declaration 
    // Method Definition
    // para1 and para2 are the formal parameters
    // arg1 and arg2 ki copy jaati hai para1 and para2 mei actual wo khud nhi jaate
    // so any changes performed on para1 and para2 doesn't affect arg1 and arg2

    // Method Signature : access modifier + non-access modifier + returnType + methodName + (parameterType parameters)

    static int methodSum (int para1, int para2) {
        int sum = para1 + para2;

        return sum;
    }
    
}
