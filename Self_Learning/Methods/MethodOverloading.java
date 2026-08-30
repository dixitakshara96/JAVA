package Self_Learning.Methods;
import java.util.Scanner;

public class MethodOverloading {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.print("Enter name: ");
        String naam = sc.next();

        method(num);
        method(naam);
    }   

    static void method(int a) {
        System.out.println("Number Multiply by 10: " + a*10);
    }

    static void method(String name) {
        System.out.println("Hello" + name);
    }
}
