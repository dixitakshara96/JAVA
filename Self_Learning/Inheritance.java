package Self_Learning;


    public class Inheritance {
        
        public static class Calculator {
            int z;
            public void addition(int x , int y) {
                z= x + y ;
                System.out.println("Sum : " + z);
            }

            public void subtraction(int x , int y) {
                z = x - y ;
                System.out.println("Subraction: "+ z);
            }
        }

        public static class MyCalculator extends Calculator{

            public void multiplication(int x , int y) {
                z = x * y ;
                System.out.println("Product:" + z);
            }
        }

    public static void main(String [] args) {
        int a = 10;
        int b = 20 ;
        MyCalculator cal = new MyCalculator() ;
        cal.addition(a,b);
        cal.multiplication(a, b);
    }
}

   

    

    
    

    


