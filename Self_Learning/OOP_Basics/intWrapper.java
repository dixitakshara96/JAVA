package OOP_Basics;

public class intWrapper {

    public static void main(String[] args) {
        // Integer is a class not Primitive DT
        // num1 and num2 are an objects
        Integer num1 = 19;
        Integer num2 = 68;

        System.out.println("\n---BEFORE SWAP---");
        System.out.println("Num1: " + num1 + "\tNum2: " + num2);

        
        swap(num1 , num2);

        System.out.println("\n---AFTER SWAP---");
        System.out.println("Num1: " + num1 + "\tNum2: " + num2);

        // but if Integer is a class why don't the value of num1 and num2 were swapped ?
        // because of the final (keyword)
        // the values should actually got swapped but there is a twist in the definition of the 
        // Integer class .
    }

     static void swap(Integer a , Integer b) {
        Integer temp = a;
        a = b;
        b= temp;

        System.out.println("\n---INSIDE SWAP---");
        System.out.println("Num1: " + a + "\tNum2: " + b);
    }    
    // same program as Swap_Magic
}
