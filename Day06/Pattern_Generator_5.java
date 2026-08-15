package Day06;

// Hollow inverted Pyramid
// *********
//  *     *
//   *   *
//    * *
//     *

// i - row
// j - spaces 
// k - stars in each row
// condition i == 0 or k ==0 and (i,k) mei jagah star print karna tha waha ek mathematical relation idetify kiya air usko condition mei likha hai

public class Pattern_Generator_5 {

    public static void main (String [] args ) {
        int n = 5 ;
        for ( int i = 0 ; i < n ; i++ ) {

            for ( int j = 0 ; j < (i) ; j++ ) {

                System.out.print(" ");
            }

            for ( int k = 0 ; k < ((2*n-1)-(2*i)) ; k++) {

                if ( k == 0 || i == 0 || k == ( 2*n - 2 - 2*i ) ) {
                    System.out.print("*");
                }
                else 
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
