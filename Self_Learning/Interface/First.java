package Self_Learning.Interface;

interface A {

    // by default variables in Interface are static final
    String name = "Hermoine";

    // by default methods in Interface are public abstract
    void start();

    void run();
}

// an interface - interface -> extends
interface B extends A {

    void end();
}

// we need a class so that we can define the method implementation
// class - interface -> implements
// java does not support multiple Inheritance but a class can implements
// infinite Interface
// a class must define all the methods which are declared in an Interface
// else the class should itself be abstract.

class C implements B {

    public void start() {
        System.out.println("Starting...");
    }

    public void run() {
        System.out.println("Running...");
    }

    public void end() {
        System.out.println("Bye Bye!");
    }
}

public class First {

    public static void main(String[] args) {

        // A obj1 = new A(); invalid : reason we can't instantiate an Interface directly
        // (but can using anonymous class/ lambda expression)

        A obj1 = new C();

        B obj2 = new C();

        obj1.start();
        obj1.run();

        // obj1.end();
        // invalid : end() is the method/behavior of an Interface B and A is not even
        // extends it
        // so the reference of an Interface A can't access it

        obj2.start();
        obj2.run();
        obj2.end();

        System.out.println(B.name);
    }
}