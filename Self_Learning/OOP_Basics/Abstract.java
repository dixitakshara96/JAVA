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
    // Naming a class Abstract (capital A) is technically legal in Java, 
    // but because abstract (lowercase a) is a reserved keyword,
    // it can cause confusion later on or trigger warnings in some IDEs.

    public static void main(String[] args) {

        // SuperClass obj = new SuperClass() ; yeh nhi kar skte hai!!!

        SubClass obj = new SubClass();

        obj.weight = 50; // from now on try to assign these values using constructor when the object is created
        // avoid manual assignment
        obj.height = 0.503;

        obj.display();
        obj.bmi();
        // kuch galat hua hai calculation mai 
        /*Change weight / height to weight / (height * height).
        aapka glt shi ho jaega*/
        // but our main purpose is to understand that
        // abstract class may or may not need to have abstract method
        // we can't create an object of astract class
        // abstract method must be declare only inside an abstract class.

    }
}
