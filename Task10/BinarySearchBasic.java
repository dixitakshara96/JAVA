public class BinarySearchBasic {

    public static boolean binarySearch(int[] arr, int k) {
        // code here
        int low = 0 ;
        int high = arr.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low ) / 2;
            
            if (arr[mid] == k ) {
                return true;
            }
            
            else if ( arr[mid] > k) {
                high = mid -1  ;
            }
            
            else if ( arr[mid] < k) {
                low = mid + 1 ;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 8, 12, 16};

        System.out.println("\nElement Found at index: " + binarySearch(arr, 8));
        System.out.println("\nElement Found at index: " + binarySearch(arr, 18));
    }
}
    

