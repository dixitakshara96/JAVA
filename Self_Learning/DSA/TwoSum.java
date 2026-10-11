package Self_Learning.DSA;
import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        int[] indices = new int[2];

        for(int i = 0 ; i < nums.length ; i++) {
            for (int j = i+1 ; j < nums.length ; j++) {

                if( nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        int[] nums = {3,5,6,8,2,9};

        System.out.println("indices: " + Arrays.toString(twoSum(nums, 13)));
    }
    
}
