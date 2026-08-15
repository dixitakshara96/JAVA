package Day06;

public class Pattern_Generator_4 {

//  Hollow Upright Pyramid
//     *
//    * *
//   *   *
//  *     *
// *********

// i - row
// j - spaces 
// k - stars in each row
//  condition ki jab k == 0 ho tab i == 4 ho or ek pattern dikh rha tha (i,k) ki values mei k==2*i toh usko use kiya hai
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Leading spaces wahi purana upright triangle jaisa
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars and inner spaces same loop purane upright jaisa
            for (int j = 1; j <= 2 * i - 1; j++) {

                //  ye kuch naya hai imp bhi 
                if (j == 1 || j == 2 * i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
   