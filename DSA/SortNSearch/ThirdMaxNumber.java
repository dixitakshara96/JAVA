package DSA.SortNSearch;

public class ThirdMaxNumber {

    public static int thirdMax(int[] nums) {

        // Step 1: Bubble Sort
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length - 1 - i; j++) {

                if (nums[j] > nums[j + 1]) {

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        // Step 2: Find third distinct maximum
        int count = 1;
        int previous = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] != previous) {

                count++;
                previous = nums[i];

                if (count == 3) {
                    return nums[i];
                }
            }
        }

        // Step 3: If less than 3 distinct numbers
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {

        int[] arr = {0,3,5,1,6,4,2,4};

        System.out.println("3rd max number: " + thirdMax(arr));
    }
}

    

