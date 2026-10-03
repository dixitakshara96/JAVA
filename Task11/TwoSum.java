package Task11;
import java.util.Arrays;

public class TwoSum {
    
    public static int[] twoSum(int[] nums, int target) {
        
        for(int i = 0 ; i < nums.length ; i++) {

            for(int j = i+1 ; j < nums.length ; j++) {

                if (( nums[i] + nums[j] ) == target ) {
                    int[] arr = {i , j};

                    return arr;
                }
            }
            
        }
        return new int[]{};
    }

    public static void main(String[] args) {

        int[] arr = {2, 6, 5, 3, 9};
        int target = 7;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}

