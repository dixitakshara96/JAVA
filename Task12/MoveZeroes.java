package Task12;
import java.util.Arrays;

public class MoveZeroes {

   public static void moveZeroes(int[] nums) {
        int write = 0;
        

        for( int read = 0 ; read < nums.length ; read++) {

            if ( nums[read] != 0 ) {
                nums[write] = nums[read];
                write++;
            }
        }

        while (write < nums.length) {
            nums[write] = 0;
            write++;
        }
        System.out.println(Arrays.toString(nums));
        
    }

    public static void main(String[] args) {

        int[] arr = {0,2,4,0,1,0,7};

        System.out.println("Moved all zeroes at last: " );
        moveZeroes(arr);

    }
}
    

