package OOP_Basics;

class Base {

    public Base() {
        // why this is printing when we creating an obj to Subclass
        System.out.println("Parent Class");
    }

    public Base(String name) {
        // when this will print ? and how it this actually working
        System.out.println("Parameterized Parent Class " + name);
    }

}

class Derived extends Base {

    public Derived() {

        // by default there is always super() method exist in every class constructor
        // whether u write write it or not.
        // super() just call the constructor of the Parent/Super Class
        // then after executing the Super/Parent class constructor code it will then
        // print the code of the Subclass which is actually created or called

        // super();   by default har class mai aise hi starting mai hota hai chahe dikhe na dikhe (Mr. India)

        System.out.println("Child Class");
    }

    public Derived(String name) {
        // yaha super nhi hai yaha this() hai 
        // yeh kya karta hai 
        // yeh same class ke Constructor ko call karta hai 
        this();
        System.out.println("Parameterized Child Class " + name);
    }

}

public class Inheritance {
    public static void main(String[] args) {

        System.out.println("\nFirst obj");
        Derived obj = new Derived();

        System.out.println("\nSecond obj");
        Derived obj1 = new Derived("Hemloo");
    }
}
