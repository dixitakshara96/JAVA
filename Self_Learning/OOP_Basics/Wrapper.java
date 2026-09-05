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
    }
    
}

