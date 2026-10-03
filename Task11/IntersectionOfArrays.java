package Task11;

import java.util.HashSet;
import java.util.Arrays;

public class IntersectionOfArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for( Integer i : nums1) {
            set1.add(i);
        }

        for(int i = 0 ; i < nums2.length ; i++) {

            if ( set1.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        
        }

        int[] arr = new int[set2.size()];

        int index = 0;
        
        for (int num : set2) {
            arr[index++] = num;
        }
        
        return arr;
    }

    public static void main(String[] args) {

        int[] array1 = {2, 5, 3, 2, 7};
        int[] array2 = {2,6,4,7, 9};

        System.out.println(Arrays.toString(intersection(array1, array2)));
    }
        
}
    

