import java.util.Arrays;

// how to optimize yeh reh gya hai

public class Sorter {

    public static void main(String[] args) {

        int[] arr = { 5, 2, 9, 1, 5, 6 };

        int n = arr.length ;

        int swaps = 0;

        for ( int i = 0 ; i < n - 1 ; i++ ) {

            for ( int j = 0 ; j < n - i - 1 ; j++ ) {

                // kuch nhi bs greater than ki jagah less than kar diya
                if (arr[j] < arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Total Swap: " + swaps);
    }
} 
