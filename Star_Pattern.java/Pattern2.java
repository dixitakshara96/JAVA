public class Pattern2 {
    public static void main(String[] args){

        for(int i = 0 ; i < 6 ; i++){
            for(int j = 0 ; j < 6 ; j++) {
                if ( j <= i ){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
}

    
