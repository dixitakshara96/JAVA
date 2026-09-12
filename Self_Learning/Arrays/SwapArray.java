package Arrays;
import java.util.Arrays;

public class SwapArray {

    public static void main(String[] args) {
        int[] array = {34, 23, 86, 16, 9};
        System.out.println("\n---BEFORE THE FUNCTION---");
        System.out.println(Arrays.toString(array));

        swapElement(array, 0, 4);

        System.out.println("\n---AFTER THE FUNCTION---");
        System.out.println(Arrays.toString(array));
    }

    // ab yaha dekho actually mamla yeh hai ki array as a parameter diya gya hai 
    // toh array jo hai wo toh reference variable hai 
    // but jo actual values hai wo objects hai jo ek container mai store hai 
    // jab humne actual uss container mai shufflinng kar di toh wo literally hua hai 
    static void swapElement( int[] arr, int i, int j) {
        int temp = arr[i]; 
        arr[i] = arr[j];
        arr[j] = temp;
        System.out.println("\n---INSIDE THE FUNCTION---");
        System.out.println(Arrays.toString(arr));
    }
    
}
