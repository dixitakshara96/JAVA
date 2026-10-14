package Task12;

import java.util.Arrays;

public class SquareOfSorted {
     public static int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }

    public static void main(String[] args) {

        int[] arr = {0,2,3,0,6,1};

        System.out.println("Moved All zeroes at last: " + Arrays.toString(sortedSquares(arr)));
    }
}
