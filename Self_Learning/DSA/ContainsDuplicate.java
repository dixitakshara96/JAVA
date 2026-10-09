package Self_Learning.DSA;

import java.util.HashMap;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        
        for( Integer value : freq.values() ) {
            if (value > 1) {
                return true;
            }
            
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {2,4,3,6,3,6};

        System.out.println("Array contains duplicate element : " + containsDuplicate(arr));
    }
}
    

