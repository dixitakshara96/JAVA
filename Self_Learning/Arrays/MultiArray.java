package Arrays;
import java.util.Scanner;
import java.util.Arrays;


public class MultiArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] array = new int[3][3];
        // mandatory to write the no. of rows 😐
        // but not necessary to write the no. of columns as well.


        // taking the input 
        // array.length = no. of rows 
        // array[row].length = no.of columns in that row
        // aisa kuch nhi hai ki saari rows mai no of columns same hi rahenge
        // aur dekho Multi Dimension(here 2D) mai kya hai ki har row ek array hai
        for (int i = 0 ; i < array.length; i++) {

            for (int j = 0 ; j < array[i].length ; j++) {

                System.out.println("Fill the element: ");
                array[i][j] = sc.nextInt();
            }
        }

        // har row ek array hai that's why yaha par humne int[] likha na ki int
        for( int[] arr : array) {
            System.out.println(Arrays.toString(arr));
        }
        
    }
}   
