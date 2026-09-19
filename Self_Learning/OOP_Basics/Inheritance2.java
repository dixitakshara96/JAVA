package OOP_Basics;

// sab print karna hai 😁

class Parent {

    public Parent() {
        // 3. ab third yaha aaya jayega phir
        // ab hume yaha this() mila toh again same class ke parameterized constructor ko
        // bulaya jayega kyunki this(parameter)
        this("John Doe");
        System.out.println("Namaste from Parent");
    }

    public Parent(String name) {
        // 4. finally ab yaha ayenge 
        // ab yaha se stack print hona shuru hoga 
        // then unwind hoga 
        // 4 3 2 1 aise printing hogi 
        System.out.println("Namaste from Parent to " + name);
    }

}

class Child extends Parent {

    public Child() {
        // 1. sabse pehle yaha aaya
        // ab usse dikha this(parameter)
        // ab wo same class ke dusre Constructor ke pass jayega
        this("John Doe");
        System.out.println("Hey from Child");
    }

    public Child(String name) {
        // 2. ab second wo yaha aaya
        // ab kya hoga ki super() jo invisible hai uwo call karega Super/Parent class ko
        System.out.println("Hey from Child to " + name);
    }
}

public class Inheritance2 {

    public static void main(String[] args) {

        Child obj = new Child();
    }

}
