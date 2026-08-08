package Day05;
import java.util.Scanner;

public class Campus_Cafeteria_Menu {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("\n--- Campus Cafeteria Menu ---\n");
        System.out.println("1. Order Food");
        System.out.println("2. Check Account Balance");
        System.out.println("3. File a Complaint");
        System.out.println("4. Exit\n");
        System.out.println("Enter your Choice between [1,4] : ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch(choice) {

            case 1 :
                System.out.println("Chole Bhature Order placed !");
                break;

            case 2 :
                System.out.println("Your Current Balance is : 7 Crore");
                break;
                
            case 3 :
                System.out.println("No Accountability until Dharna Pradarshan");
                break;

            case 4 :
                System.out.println("Lawden Bhojwam (Have a good meal !)");
                break;

            default :
                System.out.println("Invalid Choice! Please Select between 1 and 4");
        }

    }

    
}
