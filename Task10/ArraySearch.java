public class ArraySearch {

    public static int search(int arr[], int x) {
        // code here
        int n = arr.length ;
        
        for( int i = 0 ; i < n ; i++ ) {
            if ( arr[i] == x ) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {4, 7, 2, 8, 3, 5};
        System.out.println("Element Found at index : " + search( arr, 5) );
    }
}
    

