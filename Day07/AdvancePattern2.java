package Day07;

public class AdvancePattern2 {


    public static void main(String[] args) {
        int n = 5;
        for(int i = 0 ; i < n ;i++) {

            for(int j = 0 ; j< (n-(1+i)) ; j++) {
                System.out.print(" ");
            }

            for(int k = 0 ; k < (2*i+1); k++) {
                if (k == 0 || k == 2*i) 
                    System.out.print("1");

                System.out.print(" ");
            }
            System.out.println();
        }
        int m = 4;

        for ( int i = 0 ; i < m ; i++) {
            for ( int j = 0 ; j <= i ; j++) {
                System.out.print(" ");
            }
            for (int k= 0 ; k <= (2*m-2*i-1) ; k++) {
                if (k == 0 || k== (6-2*i))
                    System.out.print("1");
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    
}
