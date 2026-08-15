
public class Pattern_Generator_6 {

// Hollow Diamond
//     *
//    * *
//   *   *
//  *     *
// *       *
//  *     *
//   *   *
//    * *
//     *

// i - row
// j - spaces 
// k - stars in each row
// isme pehle ek upright + ek inverted hollow pyramid print kiya hai
    public static void main(String[] args) {

        int n = 5 ;
        for (int i = 0 ; i < n ;  i++ ) {

            for (int j = 0 ; j < (n-i-1) ; j++ ) {
                System.out.print(" ");
            } 

            for (int k = 0 ; k < (2*i+1) ; k++) {
                if ( k == 0 || k == (2*i))
                    System.out.print("*");

                else 
                    System.out.print(" ");
                }
            System.out.println();
            
        }
        int m = 4;
        for (int i = 0 ; i < m ;  i++ ) {

            for (int j = 0 ; j <= (i) ; j++ ) {
                System.out.print(" ");
            } 

            for (int k = 0 ; k < (2*m-2*i-1) ; k++) {
                if ( k == 0 || k == (6-2*i))
                    System.out.print("*");

                else 
                    System.out.print(" ");
            }
            System.out.println();
            
        }
    }
}
