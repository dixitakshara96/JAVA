
class Animal {

    String name;

    Animal (String name) {
        this.name = "Dog"; 
    }

    void identity() {
        System.out.println("Animal: " + name);
    }

}

class Dog extends Animal{
    String name = "Labrador";
    
    Dog()  {
        super("Hehe");
        System.out.println("Dog Contructor");
    }

    void info() {
        System.out.println("Animal: " + super.name);
        System.out.println("Dog Breed: " + name );
    }
}

public class Super {

    public static void main(String[]args) {

        Dog myDog = new Dog();
        myDog.info();
    }
}
