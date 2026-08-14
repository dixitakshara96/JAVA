package Day06;

public class Pattern_Generator_4 {

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
   