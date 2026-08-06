package Self_Learning;
import java.util.Scanner;

public class Conditional_Statement {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks= sc.nextInt();
        sc.nextLine();

        if (marks>=85){
            System.out.println("Grade A");
        }

        else if (marks>=65){
            System.out.println("Grade B");
        }
        else if (marks>=45){
            System.out.println("Grade C");
        }
        else if (marks>=33){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade Fail");
        }


    }
    
}
