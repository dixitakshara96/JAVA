package Self_Learning.Methods;

public class Armstrong {

    public static void main(String[]args) {
        System.out.println("=== Armstrong Numbers Between 100 to 999 ===");

        armstrong(); // calling the method
    }

    // defined the method
    static void armstrong() {
        
        // this for loop will going to check for each and every value from 100 to 999.
        for (int i = 100 ; i < 1000; i++) {

            int num = i; // here we are storing (referece) the value of i in num because we have to perform some operation on value of i but to also have the original value as it is. 
            
            int armNum = 0; // here this variable will going to store Armstrong value of each i

            while (num > 0) { 
                // we are now checking for single value
                armNum += ((num % 10) *  (num % 10) * (num % 10)) ; 
                num /= 10; 
            }

            // actual conditon for a number to be an Armstrong Number
            if (armNum == i) {
                System.out.println(i);
            }
        }
    }
    
}
