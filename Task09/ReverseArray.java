package Task09;
import java.util.Arrays;

public class ReverseArray {

    public static void reverseArray( int[] array ) {
        int right = ( array.length ) - 1;
        int left = 0;
    
        while (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;

                left++;
                right--;
            }
        }
    

    public static void main(String[] args) {
        int[] arr = {3, 7, 9, 2, 1};

        System.out.println("Before Reversing: " + Arrays.toString(arr));
        
        reverseArray( arr );

        System.out.println("After Reversing: " + Arrays.toString(arr));
    }
}
    

