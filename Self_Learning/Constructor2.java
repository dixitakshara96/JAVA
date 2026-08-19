package Self_Learning;

public class Constructor2 {

    // instance variable 
    int x ; 
    Constructor2(int i) {
        // Local variabe
        x = i ;
    }

    public static void main(String []args) {
        Constructor2 c1 = new Constructor2(10) ;
        Constructor2 c2 = new Constructor2(20) ;

        System.out.println("Object 1: "+c1.x);
        System.out.println("Object 2: "+c2.x);

    }
}
