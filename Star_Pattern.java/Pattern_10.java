public class Pattern_10 {

    public static void main(String[]args) {

        int n = 5;

        for (int i = 0 ; i < n ; i++) {

            for (int j = 0 ; j < 5-i ; j++) {
                System.out.print(" ");
            }

            // Understand the logic here 

            for( int k = 0 ; k <= 2*i ; k++) {
                if ( k == 0 || i == n-1 || (k == 2*i)) {
                    System.out.print("*");
                }
                // Understand the logic here as well else vs not writing else 
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
    
}
