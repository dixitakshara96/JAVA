package Self_Learning.DSA;
import java.util.Arrays;

public class PrefixSufix {

    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int prefix = 1;

        int suffix = 1;

        int[] answer = new int[n];

        for( int i = 0 ; i < n ; i++) {

            answer[i] = prefix;
            prefix = nums[i] * prefix;
        }

        for( int i = n-1 ; i >=0 ; i--) {

            answer[i] = suffix * answer[i];
            suffix = nums[i] * suffix;
        }

        return answer;

    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int[] ans = productExceptSelf(arr);

        System.out.println("Product Except Self : " + Arrays.toString(ans));
    }    
}
