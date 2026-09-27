
public class CheckSorted {

    public static boolean isSorted(int[] arr) {
        // code here
        int n = arr.length ;
        
        for (int i = 0 ; i < n - 1 ; i++) {
            
            if ( arr[i] > arr[i+1] ) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 8, 11, 14} ;

        System.out.println("Checked if first array is sorted: " + isSorted(arr));

        int[] arr1 = {4,2,7,5, 8, 1};

        System.out.println("Checked if second array is sorted: " + isSorted(arr1));

    }
}
