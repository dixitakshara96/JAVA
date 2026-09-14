package Arrays;

public class JaggedArray {

    // What is Jagged Array?
    // array jiski no. of columns fix nhi hai, vary kar rhe hai columns, row change
    // hone pe jaruri nhi hai ki no of column same ho

    public static void main(String[] args) {

        int[][] array = new int[3][]; // yaha pe humne no.of columns nhi btaye hai

        // in java 2D array ki agar baat karen toh har row ek separate array hai
        // toh ab hum yaha har row ke liye initialization kar rhe hai
        array[0] = new int[2];
        array[1] = new int[3];
        array[2] = new int[4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // with the help of Math.random() hum values ko randomly fill kar rhe hai 
                // (int) is used for type casting
                // Math.random() basically [0,1) ke beech ki values generate karta hai
                array[i][j] = (int) (Math.random() * 10);
            }

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
