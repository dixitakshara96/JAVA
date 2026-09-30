package Task11;
import java.util.ArrayList;

public class FrequencyCount {

    public static ArrayList<Integer> frequencyCount(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> freq = new ArrayList<>();
        
        for (int i = 0 ; i < n ; i++) {
            freq.add(0);
        }
        
        
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if (num >= 1 && num <= n) {
                freq.set(num - 1, freq.get(num - 1) + 1);
            }
        }

        return freq;
    }


    public static void main(String[] args) {
        int[] array = {3, 5, 1, 2, 3, 1, 2, 2};

        ArrayList<Integer> count = frequencyCount(array);

        System.out.println("Frequncy: " + count);
    }
    
}
