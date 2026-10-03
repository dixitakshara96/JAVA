package Task11;

import java.util.HashSet;

public class ContainsDuplicate {

    // using this method we store the value of array into a set 
    // set only contains the unique elements
    // so if any value repeats it automatically not stored in a set.
    // now if we want to know that the array contains any duplicate element 
    // then we can compare the length/size of an array and a set.
    
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
    

