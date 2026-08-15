package Day06;


// Diamond shape
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *

// i - row
// j - spaces 
// k - stars in each row 
// combined 2 for loops (upright and inverted)

public class Pattern_Generator_3 {

    public static void main(String[] args) {

        for ( int i = 1 ; i < 5 ; i++ ) {

            for ( int j = 1 ; j < (5-i) ; j++ ) {
                System.out.print(" ") ;
            }
            for ( int k = 1 ; k <= (2*i-1) ; k++ ) {
                System.out.print("*") ;
            }
            System.out.println();
           
        }
        for ( int i = 1 ; i < 5 ; i++ ) {

            for ( int j = 1 ; j <= (i) ; j++ ) {
                System.out.print(" ") ;
            }
            for ( int k = 0 ; k < (7-2*i) ; k++ ) {
                System.out.print("*") ;
            }
            System.out.println();
           
        }


        
    }
    
}
