package Day07;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[]args) {
        int[] array = {10, 20, 30, 40, 50};
        
        Scanner sc = new Scanner(System.in);

        String name = null;

        String ID = "abc";

        try {
            System.out.println("\nAccessing value at index 10: ");
            System.out.println(array[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Size of Array is less");
        }

        try {
            System.out.println("\nDivision");
            int a = 10 / 0;
        }
        
        catch (ArithmeticException e){
            System.out.println("Cannot divide by Zero");
        }

        try {
            System.out.println("\nEnter your favorite number: ");
            int num = sc.nextInt();
            System.out.println("Fav Num: " + num);
        }
        catch(InputMismatchException e) {
            System.out.println("Invalid Input you haven't entered digit ");
        }

        try {
            System.out.println("\nNAME: ");
            System.out.println("\nLength of name: " + name.length());
        }
        catch (NullPointerException e) {
            System.out.println("\nName is null cannot get the length");
        }

        try {
            System.out.println("\nConverting String to int");
            int id = Integer.parseInt(ID);
        }
        catch(NumberFormatException e) {
            System.out.println("\nString to Integer conversion fails because String does not contains digit");
        }

    }
    
}
