package Task12;
import java.util.Arrays;


public class MergedSortedArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;       // Last valid element of nums1
        int j = n - 1;       // Last element of nums2
        int k = m + n - 1;   // Last position of nums1 yeh humne isliye liya hai taaki nums1 mai hi elements daalne hai baad mai 

        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        // Copy remaining elements of nums2, if any
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {1,3,5,0,0,0};
        int[] arr2 = {2,3,4};

        merge(arr1 , 3 , arr2 , 3);

        System.out.println(Arrays.toString(arr1));

    }
}
