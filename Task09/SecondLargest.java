package Task09;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 1, 9, 3, 5};

        int max = arr[0];
        int secmax = 0 ;

        for(int i = 0 ; i < arr.length ; i++ ) {
            if( arr[i] > max ) {
                secmax = max; //  it is important to first store the value of max into secmax
                max = arr[i]; //  then we assign the maximum value to max variable
            }
        }
        System.out.println("Second Largest Element : " + secmax);
    }
  
}
