package Day07;
import java.util.ArrayList;


// Pascal Triangle

public class AdvancePattern3 {

    public static void main(String[]args) {

        int n = 5;

        ArrayList<Integer> previous = new ArrayList<>();

        for(int i = 0 ; i < n ; i++) {

            ArrayList<Integer> current = new ArrayList<>();
            current.add(1) ;


            for(int j = 0 ; j < (n-i) ; j++ ) {
                System.out.print(" ");
            }

            for (int k = 1 ; k < i; k++) {

                
                int value = previous.get(k-1) + previous.get(k);
                current.add(value);    
                }
                if ( i > 0) {
                    current.add(1);
                }

            for (Integer  value : current) {
                System.out.print(value);
                
            }
            System.out.println();  

            previous = current;         
                
            }
        }
    }
    

