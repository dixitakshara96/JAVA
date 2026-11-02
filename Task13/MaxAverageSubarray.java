package Task13;

public class MaxAverageSubarray {

    public static double findMaxAverage(int[] nums, int k) {
        double max_avg = Integer.MIN_VALUE;
        double sum = 0;

        for(int i = 0 ; i < nums.length ; i++) {
      
            sum += nums[i];

            if ( i >= k-1) {

                max_avg = Math.max(sum , max_avg);
                sum -= nums[i - k + 1];
            }

        }

        return (max_avg / k);
    }

    public static void main(String[] args) {
        
        int[] arr = {3, 4, 6, 7, 2, 1};

        System.out.println("Max Average: " + findMaxAverage(arr, 3));
    }
    
}
