package OOP_Basics;

public class Wrapper {

    public static void main(String[] args) {

        int var = 10;

        Integer num1 = 20;
        Integer num2 = 30;

        System.out.println(num1.compareTo(num2));
        System.out.println(num2.compareTo(num1));
        System.out.println(num1.compareTo(num1));

        // in java int is a primitive DT
        // whereas
        // Integer is a class (similar to String)

        int var1 = 45;

        // cross isliye hua hai kyunki depricated hai
        Integer var2 = new Integer(var1); // boxing
        Integer var3 = var1 ; // autoboxing

        Integer var4 = 69;
        int var5 = var4.intValue(); // unboxing

        int var6 = var4; // auto unboxing
    }
    
}

