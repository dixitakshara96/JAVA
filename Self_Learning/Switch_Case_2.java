package Self_Learning;
import java.util.Scanner;

public class Switch_Case_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your Grade : ");
        String Grade = sc.nextLine();

        switch(Grade){
            case "A": 
                System.out.println("Excellent! ");
                break;
            case "B": 
                System.out.println("Very Good! ");
                break;
            case "C": 
                System.out.println("Good! ");
                break;
            case "D": 
                System.out.println("Average! ");
                break;
            case "E": 
                System.out.println("Need Improvement! ");
                break;
            case "F": 
                System.out.println("Excellent! ");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
    
}
