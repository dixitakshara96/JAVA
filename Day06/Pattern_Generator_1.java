package Day06;

public class Pattern_Generator_1 {
    public static void main(String[] args) {

        for (int i = 0 ; i < 6 ; i++ ) {
            for (int j = 0 ; j<6 ; j++) {
                if ( j < i ) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
        for (int i = 0 ; i < 6 ; i++ ) {
            for (int j = 6 ; j<12 ; j++) {
                if ( i < j ) {
                    System.out.print("*");
                }
                // else {
                //     System.out.print("*");
                // }

            }
            System.out.println();
        }
    }




}
    