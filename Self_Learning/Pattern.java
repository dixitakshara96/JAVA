package Self_Learning;

public class Pattern {
    public static void main(String[] args){
        for( int i = 0 ; i <6 ; i++ ){

            for(int j = 0 ; j <6 ; j++){  // nothing just a simple row and column logic 
                
                if (i == 0 && j== 0){
                    System.out.print("*");
                }

                if (i == 1 && j <= 1){
                    System.out.print("*");
                }

                if (i == 2 && j <= 2){
                    System.out.print("*");
                }

                if (i == 3 && j <= 3){
                    System.out.print("*");
                }

                if (i == 4 && j <= 4){
                    System.out.print("*");
                }

                if ( i == 5 && j <= 5){
                    System.out.print("*");
                }
                
            }
        
                System.out.print("\n"); // here is the main game 
                
        }
    
    }
}
