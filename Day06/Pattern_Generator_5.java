package Day06;

public class Pattern_Generator_5 {

    public static void main(String[] args) {
        int n = 3 ;
        for (int i = 0 ; i < n ; i ++ ) {

            for ( int j = 0 ; j < i ; j++ ) {
                System.out.print(" ");
            }

            for ( int k = 0 ; k < (5-2*i); k++) {

                System.out.print("*");
            }
            System.out.println();

        }
    }
    
}
