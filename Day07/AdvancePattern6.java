package Day07;

public class AdvancePattern6 {

    public static void main(String[]args) {

        int n = 5;

        for (int i = 1 ; i <= 5 ; i++) {
            
            for ( int j = 1 ; j <= (n-i); j++ ) {
                System.out.print(" ");
            }

            for(int k = 1 ; k <= (2*i-1) ; k++) {
                
                if (i == n ) {
                    if (k % 2 != 0) {
                        System.out.print((k+1 )/ 2);
                    }
                    else {
                        System.out.print(" ");
                    }
                    
                }

                else if (k == 1) {
                    System.out.print(k);
                }

                else if (k == (2*i-1)) {
                    System.out.print(i);
                }

                // else here is quite important
                 
                else {
                    System.out.print(" ");
                }
                           
            }

            System.out.println();
        }
    }
}
