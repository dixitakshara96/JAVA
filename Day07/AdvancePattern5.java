package Day07;
import java.util.ArrayList;

public class AdvancePattern5 {

    public static void main(String []args) {
        int n = 5 ;
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0 ; i < (2 * n - 1) ; i++) {
            for (int j = 0 ; j < (2* n - 1) ; j++) {
                int top = i;
                int bottom = (2 * n -2) - i;
                int left = j;
                int right = (2*n-2) - j;
                array.add(top);
                array.add(bottom);
                array.add(left);
                array.add(right);
                int min = array.get(0);
                for (int k = 0 ; k< 4 ; k++ ) {
                    if (min > array.get(k)) {
                        min = array.get(k);
                    }
                }
                System.out.print(n-min);
                array.clear();
            }
            System.out.println();
        }
    }
    
}
