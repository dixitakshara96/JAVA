package Code_Analysis.Task06;

public class Case_3 {

    public static void main(String[]args) {

        for(int i = 1 ; i <= 3; i++) {
            for( int j = 1 ; j <= 3 ; j++) {

                if (j == 2) {
                    continue;
                }

                System.out.println(i + " " + j);
            }
        }
    }
    
}
