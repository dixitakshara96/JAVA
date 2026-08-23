package Day07;
import java.util.Scanner;

public class InputValidation {

    static void validateAge(int age) {

        if ((age < 0) | (age > 150)) {
            throw new IllegalArgumentException("Invalid Age!!!");
        }

        System.out.println("Valid Age: " + age);
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        
        try {
            validateAge(age);
        }
        catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
        }
        
    }
}
