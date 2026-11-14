package DSA.SlidingWindow;

import java.util.HashMap;

public class LongestHarmoniousSubSequence {

    // also got to know the difference between Subsequence and Subarray

    public static int findLHS(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Step 1: Count frequency of every number
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxLength = 0;

        // Step 2: Check consecutive numbers
        for (int num : freq.keySet()) {

            if (freq.containsKey(num + 1)) {

                int length = freq.get(num) + freq.get(num + 1);

                // Step 3: Update maximum length
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] arr = {2,3,5,4,3,2,4,2,3};

        System.out.println("longest harmonious subsequence: " + findLHS(arr));
    }
}

    

