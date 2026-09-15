package String;

public class StringMethods {

    public static void main(String[] args) {

        // this is also a way and it won't through an error 😊 similar to String name = ""
        String name = new String(); 
        String name1 = new String("Shweta");
        String name2 = "Rohit";


        name2 = name2 + " Sharma"; // here we have to concepts
        // 1. now name2 is refering to Raghav Pandey so garbage Collector will remove
        // Raghav from memory
        // 2. String Concatenation 
        // we are not changing the string here

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name1);

        System.out.println(name1.concat(name2));
        System.out.println(name1.hashCode());

        
    }

}
