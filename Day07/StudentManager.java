package Day07;
import java.util.Scanner;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;


public class StudentManager {

    public static void main(String[] args) {
        // HashMap < int , String > student = new HashMap<>();
        HashMap<Integer, String> students = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\n---MENU---\n");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            
            try {
                System.out.println("\nEnter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch(choice) {
                    case 1 : 
                        System.out.println("\nEnter student ID (unique): ");
                        int studentID = sc.nextInt();
                        sc.nextLine();
                        try {
                            if (students.containsKey(studentID)) {
                                throw new IllegalArgumentException("Student already exist");
                            }
                            
                            System.out.println("Enter student Name: ");
                            String name = sc.nextLine();
                            students.put(studentID , name) ;   
                        }

                        catch(IllegalArgumentException e) {
                            System.out.println("\nStudent Already Exists");
                        }
                        break;


                    case 2 :
                        try {
                        System.out.println("\nEnter student ID for Searching : ");
                        int studentID2 = sc.nextInt();
                        sc.nextLine();
                        if(students.get(studentID2) == null) {
                            throw new IllegalArgumentException("\nStudent NOT FOUND");
                        }
                        System.out.println("\nStudent Found: " + students.get(studentID2));
                        }
                        catch(IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 3 :
                        System.out.println("Enter student ID you want to remove: ");
                        int studentID3 = sc.nextInt();
                        sc.nextLine();
                        students.remove(studentID3);
                        break;

                    case 4 :
                        for (Map.Entry<Integer, String> entry : students.entrySet()) {
                            System.out.println(entry.getKey() + " : " + entry.getValue());
                        }
                        break;

                    case 5 :
                        System.out.println("\nBye Bye");
                        return;

                    default :
                        System.out.println("\nInvalid Choice ");
                        break;
                    
                }
            }
            catch (InputMismatchException e) {
                System.out.println("\nPlease enter a number.");
                sc.nextLine();
            }
        }
        
    }
    
}