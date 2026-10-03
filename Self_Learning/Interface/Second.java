package Self_Learning.Interface;

// usually developer use this concept for making an app flexible. 
// this concept is called loosely coupled.
// here this interface is a fundamental
interface Mammal {

    void hands();
    void legs();
}


class Human implements Mammal {

    public void hands() {
        System.out.println("Human has 2 hands");
    }

    public void legs() {
        System.out.println("Human has 2 legs");
    }
}

class Dog implements Mammal {

    public void hands() {
        System.out.println("\nDog has No hands");
    }

    public void legs() {
        System.out.println("Dog has 4 legs");
    }
}

// common for both the classes
class InfoOfMammal {

    // this method takes object as a parameter
    public void info(Mammal obj) {
        obj.hands();
        obj.legs();
    }
}

public class Second {
    
    public static void main(String[] args) {

        // we will create objects of class whose reference variable is an Interface
        Mammal m1 = new Human();
        Mammal m2 = new Dog();

        // this is the class which has a method who takes object as a parameter.
        InfoOfMammal inform = new InfoOfMammal();

        inform.info(m1);
        inform.info(m2);
    }
}

// What is the key concept?
// reference object which is passes when a method call will decide which class method will be run.
