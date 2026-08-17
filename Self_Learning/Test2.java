package Self_Learning;

public class Test2 {

    public static void main(String [] args) {

        int age = 20;
        boolean id = false;

        if (age>= 18 ) 
            if (id) 
                System.out.println("Valid" );
        
        // this else block will going to print because {} nhi hai toh wo sabse closest if se khud ko associate karega.
        else 
            System.out.println("Age Less Than 18");

    }
    
}
