package Task13;
import java.util.HashMap;

public class ContainsDuplicateII {

    public static boolean isContainsDuplicateII(int[] nums , int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for( int i = 0  ; i < nums.length ; i++) {

            if ( map.containsKey(nums[i])) {

                if ( i - map.get(nums[i]) <= k) {
                    return true;
                }
            }

            map.put( nums[i] , i);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1,3,2,1,4,2};

        System.out.println("Contains Duplicate: " + isContainsDuplicateII(arr, 3 ));
    }
    
}
