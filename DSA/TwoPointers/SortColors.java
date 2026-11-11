package DSA.TwoPointers;

import java.util.Arrays;

public class SortColors {

    public static int[] sortColors(int[] colors) {

        int low = 0 ;
        int mid = 0;
        int high = colors.length - 1;

        while(mid <= high) {

            if(colors[mid] == 0 ) {

                int temp = colors[mid];
                colors[mid] = colors[low];
                colors[low] = temp;

                mid++;
                low++;
            }

            else if ( colors[mid] == 1) {
                mid++;
            }

            else {

                int temp = colors[mid];
                colors[mid] = colors[high];
                colors[high] = temp;
                high--;
            }
        }
        return colors;
    }

    public static void main(String[] args ) {

        int[] flag = {0, 2, 2, 1, 2, 1, 0, 1 ,0};

        System.out.println("Sorted colors: " + Arrays.toString(sortColors(flag)));
    }
    
}
