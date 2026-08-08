package Day05;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Attendance (in Percentage) between the range of [0,100] : ");
        int attendance = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your Marks (in Percentage) between the range of [0,100]: ");
        int marks = sc.nextInt();
        sc.nextLine();

        if (marks < 0 || marks > 100 || attendance < 0 || attendance > 100) {
            System.out.println("Invalid Input");
        }

        else {
            if (attendance < 75) {
                System.out.println("Debarred: Attendance is below 75%");
            }
            else {
                if (marks >= 90) {
                    System.out.println("Grade A : (Outstanding)");
                }
                else if (marks >= 75) {
                    System.out.println("Grade B : (Good)");
                }
                else if (marks >= 60) {
                    System.out.println("Grade C : (Average)");
                }
                else if (marks >= 40) {
                    System.out.println("Grade D : (Pass)");
                }
                else {
                    System.out.println("Grade F : (Fail)");
                }
            }
        }


    }
    
}
