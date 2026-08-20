package Self_Learning;

public class methodOverloading2 {

    static int minFunction(int a , int b) {
        int min;

        if ( a < b) {
            min = a;
            return min;
        
        }

        min = b;
        return min;
        

    }
    static double minFunction(double x , double y) {
        double min;

        if ( x < y) {
            min = x;
            return min;
        
        }

        min = y;
        return min;
        

    }

    public static void main(String[] args) {
        int result = minFunction(1,2) ;

        double result2 = minFunction(1.34 , 2.15) ;

        System.out.println("Min value between 1 and 2 = " + result);
        System.out.println("Min value between 1.75 and 2.45 = " + result2);
    }


    
}
