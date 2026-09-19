package OOP_Basics;

import java.lang.classfile.Superclass;

class SuperClass {

    public void showA() {
        System.out.println("Super Class");
    }
}

class SubClass extends SuperClass {

    public void showB() {
        System.out.println("SubClass");
    }
}

class SubClassSecond extends SuperClass {

    public void showC() {
        System.out.println("Second Subclass");
    }
}

public class DynamicMethodDispatch {

    public static void main(String[] args) {
        // Dynamic Method Dispatch : this whole thing is called this .
        // Runtime Polymorphism that's why called dynamic
        // very similar to normal Polymorphism but but but twist is
        // we have created the reference variable of type SuperClass but obj of SubClass
        // this is basically implicit Upcasting
        SuperClass obj = new SubClass();
        obj.showA(); // sirf showA() hi ho skta hai kyunki SuperClass nhi janta SubClass and SubClassSecond ko
        // aapke mummy papa aapko nhi jante aisa real world mai toh nhi hota but yaha hai 😑


        // SubClass obj2 = new SuperClass();  yeh nhi kar skte hai directly 
    
        obj = new SubClassSecond();
        obj.showA();

        SuperClass obj1 = new SubClassSecond();

        obj1.showA();

        // this is called Downcasting and this can be only done Explicitly
        SubClass obj2 = (SubClass) new SuperClass();
        obj2.showA();
        obj2.showB();
    }
    
}
