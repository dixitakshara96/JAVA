package Day07;
public class AdvancePattern4 {
    public static void main(String[]args) {

        int n = 5;
        for ( int i = 0 ; i < n ; i++) {

            // Left side Stars
            for( int j = 0 ; j<= i; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int k = 1 ; k< (8-2*i+1) ; k++) {
                System.out.print(" ");
            }

            // Right side stars
             for( int j = 0 ; j<= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of butterfly
        int m = 4;

        for(int i = 0 ; i< 4 ; i++) {

            // Left side Stars

            for ( int j = 0 ; j< (m-i); j++) { 
                System.out.print("*");
            }

            // Middle Spaces
            for( int k = 1 ; k < (2*i+3); k++) {
                System.out.print(" ");
            }

            // Right side stars
            for ( int j = 0 ; j< (m-i); j++) {
                System.out.print("*");
            }
                

            System.out.println();
        }
    }
    
}
