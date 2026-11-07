package DSA.TwoPointers;

import java.util.*;


public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Fix one element
        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Two pointers
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    // Store valid triplet
                    result.add(Arrays.asList(
                        nums[i], nums[left], nums[right]
                    ));

                    // Skip duplicate left values
                    while (left < right &&
                           nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right &&
                           nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move both pointers
                    left++;
                    right--;
                }

                else if (sum < 0) {
                    // Sum is too small
                    left++;
                }

                else {
                    // Sum is too large
                    right--;
                }
            }
        }

        return result;
    }

   // my solution 
    // public List<List<Integer>> threeSum(int[] nums) {
        
    //     List<List<Integer>> list = new ArrayList<>();

    //     Arrays.sort(nums);

    //     for (int i = 0 ; i < nums.length - 2; i++) {

    //         int left = i+1;
    //         int right = nums.length-1;

    //         while(left < right) {
                
    //             if ( nums[left] + nums[right] == (-nums[i])) {
    //                 List<Integer> arr = new ArrayList<>();
    //                 arr.add(nums[i]);
    //                 arr.add(nums[left]);
    //                 arr.add(nums[right]);

    //                 if (list.contains(arr) == false ) {
    //                     list.add(arr);
    //                 } 
    //                 left++;
    //                 right--;
    //             }

    //             else if ( nums[left] + nums[right] > (-nums[i])) {
    //                 right--;
    //             }

    //             else if ( nums[left] + nums[right] < (-nums[i])) {
                    
    //                 left++;
    //             }
    //         }
    //     }
    //     return list;
    // }

    public static void main(String[] args) {

        int[] array = {-4,2,4,0,1,-1,-2};

        System.out.println("\n3 No.s in array whose sum is Zero: \n " + threeSum(array));
    }
}



    

