package OOP_Basics;

abstract class SuperClass {

    double weight;
    double height;

    void display() {
        System.out.println("Weight: " + weight + "\nHeight: " + height);
    }
}

class SubClass extends SuperClass {
    int age;

    void bmi() {
        System.out.println("BMI: " + ( weight / height ));
    }
}

public class Abstract {

    public static void main(String[] args) {

        // SuperClass obj = new SuperClass() ; yeh nhi kar skte hai!!!

        SubClass obj = new SubClass();

        obj.weight = 50;
        obj.height = 0.503;

        obj.display();
        obj.bmi();
        // kuch galat hua hai calculation mai 
        // but our main purpose is to understand that
        // abstract class may or may not need to have abstract method
        // we can't create an object of astract class
        // abstract method must be declare only inside an abstract class.

    }
}
