package Task13;

import java.util.HashMap;

public class MajorityElement {
    
    public static int majorityElement(int[] nums) {

        int n = nums.length ;
        int majority = 0;

        if (n == 1) return nums[0];

        HashMap <Integer, Integer> map = new HashMap<>();

        for ( int i = 0 ; i < nums.length ; i++ ) {

            map.put(nums[i] , map.getOrDefault( nums[i] , 0 ) + 1);
        }


        for ( int i = 0 ; i < nums.length ; i++) {

            if ( (n / 2) < map.get(nums[i]) && majority < (n / 2) ) {

                 majority = nums[i];
            }
        }

        return majority;
        
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 4, 4, } ;

        System.out.println("Majority Element: " + majorityElement(arr));
    }
}
