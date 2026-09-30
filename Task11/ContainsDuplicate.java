package Task11;

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for( int i = 0 ; i < nums.length; i++) {
            set.add(Integer.valueOf( nums[i] ));
        }

        if (nums.length > set.size()) {
            return true;
        }
        return false;
        
        
    }

    public static void main(String[] args) {

        int[] array = {3, 5, 6,7, 8, 2,2};

        System.out.println("Duplicate values present in array: " + containsDuplicate(array));
    }
}
    

