package OOP_Basics;

class SuperA {

    String name;
    int id;
    String course = "B.TECH";

    // created a Inner Class
    // why do we create it

    // We create inner classes in Java to logically group components that belong
    // together, enhancing encapsulation by allowing the inner class direct access
    // to all private members of its outer class

    // one more important thing we can see that there exist SuperA$InnerA.class yahi
    // mtlb hai ki inner class bani hai SuperA ki jiska naam InnerA hai

    class InnerA {

        public void nameDisplay() {
            System.out.println("\nName: " + name);
        }
    }

    public void completeInfo() {
        System.out.println("ID: " + id + "\nName: " + name + "\nCourse: " + course);
    }

}

public class Inner {

    public static void main(String[] args) {

        SuperA obj = new SuperA();
        obj.name = "JDK";
        obj.id = 43;
        obj.completeInfo();

        /*
         * here it is like " KON InnerA " i don't know this
         * because InnerA is inside the SuperA so u have to specify that as well
         */
        // InnerA obj1 = new InnerA();

        // you also need an object of Outer class to instantiate the object of the Inner
        // class
        // in the case of non - Static inner class
        SuperA.InnerA obj1 = obj.new InnerA();
        obj1.nameDisplay();
    }
}
