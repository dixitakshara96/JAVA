package Self_Learning;
import java.util.Scanner;

public class Nested_if {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age= sc.nextInt();
        sc.nextLine();

        if (age>=18){
            System.out.println("Eligible to vote");
            if(age>=28){
                System.out.println("Adult");
            }

            else if (age>=69){
                System.out.println("Senior Citizen");
            }
            
        }
        else{
            System.out.println("Teenager");
        }
    }
    



    
}
