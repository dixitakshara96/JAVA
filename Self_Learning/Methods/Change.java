package Self_Learning.Methods;

import java.util.Arrays;

public class Change {

    public static void main(String[]args) {
        int[] array = {10, 20, 30, 40, 50};

        System.out.println("Before: " + Arrays.toString(array));

        changeMethod(array);

        System.out.println("After: " + Arrays.toString(array));
    }

    // here changes occured to the object 
    static void changeMethod(int[] nums) {
        nums[0] = 690;
    }

    // only because ArrayList is mutable 

}
