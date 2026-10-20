package Task12;
import java.util.Arrays;

public class TwoSumII {

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length -  1;
        int[] arr = new int[2];

        while(left < right) {

            if( numbers[left] + numbers[right] == target) {
                arr[0] = left + 1;
                arr[1] = right + 1;
                return arr;
            }

            else if( numbers[left] + numbers[right] < target) {
                left++;
            }

            else if( numbers[left] + numbers[right] > target) {
                right--;
            }

        }
        return new int[0];
    }

    public static void main(String[] args) {

        int[] array = {2,5,8,9,10};

        int[] indices = twoSum(array , 11);

        System.out.println(Arrays.toString(indices));

    }
    
}
