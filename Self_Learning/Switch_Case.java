package Self_Learning;
import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter operation(+,-,/,,*): ");
        String operator= sc.nextLine();

        System.out.println("Enter first no.: ");
        int num1= sc.nextInt();
        sc.nextLine();

        System.out.println("Enter first no.: ");
        int num2= sc.nextInt();
        sc.nextLine();

        switch(operator){
            case "+":
                System.out.print("Sum: "+ (num1+num2));
                break;

            case "-":
                System.out.print("Minus: "+(num1-num2));
                break;

            case "*":
                System.out.print("Product: "+(num1*num2));
                break;

            case "/":
                System.out.print("Divide: "+(num1/num2));
                break;

            default:
                System.out.println("Invalid Input");
        }



    }
}
