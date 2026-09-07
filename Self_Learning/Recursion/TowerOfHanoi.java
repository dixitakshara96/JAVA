package Recursion;
import java.util.Scanner;

public class TowerOfHanoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of disk: ") ;
        int disk = sc.nextInt();

        towerOfH(disk, 'S', 'A', 'D') ;
    }

    static void towerOfH ( int n , char A , char B , char C) {

        if (n == 1) {
            System.out.println("Moves from " + A + " to " + C);
            return;
        }

        else {
            towerOfH (n-1, A, C, B);
            System.out.println("Moves from " + A + " to " + C);
            towerOfH (n-1 , B, A, C);
            return;
        }
    
    }
    
}
