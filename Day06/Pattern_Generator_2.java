package Day06;

// Parallelogram or inclined sqaure
//      *****
//     *****
//    *****
//   *****
//  *****
// i - row
// j - spaces 
// k - stars in each row

public class Pattern_Generator_2 {

    public static void main (String [] args) {

        for (int i = 0 ; i < 5 ; i++ ) {

            // This loop will going to print spaces
            for (int j = 0 ; j < (5-i) ; j++) {
                System.out.print(" ") ;
            }

            // This loop will going to print stars in each row
            for (int k = 0 ; k < 5 ; k++) {
                System.out.print("*") ;

            }

            
            System.out.println();
        }
    }
    
}
