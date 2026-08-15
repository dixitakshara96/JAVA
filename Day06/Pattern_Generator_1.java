package Day06;

// inverted triangle pattern
// *********
//  *******
//   *****
//    ***
//     *

// i - row
// j - spaces 
// k - stars in each row

public class Pattern_Generator_1 {

    public static void main(String[] args) {
        for ( int i = 0 ; i < 5 ; i ++) {

            for ( int j = 0 ; j < i ; j++) {

                System.out.print(" ") ;
            }

            for (int j = 0 ; j < ((2*5-2*i-1)); j++) {
                System.out.print("*") ;
            }
            System.out.println();
        }

    }
    
}
