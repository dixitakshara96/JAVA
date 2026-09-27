public class EvenDigitNumbers {

    public static int findNumbers(int[] nums) {

        int even = 0;

        for ( int i = 0 ; i < nums.length ; i++ ) {
            int count = 0;
            while ( nums[i] > 0) {
                nums[i] = nums[i] / 10 ;
                count++ ;
            }

            if (count % 2 == 0) {
                even++;
            }
        }

        return even;
    }

    public static void main(String[] args) {

        int[] arr = {24, 642, 7534, 42251, 98, 143};

        System.out.println("Total count of numbers which have even no. of digits : " + findNumbers(arr));
    }
}
    

