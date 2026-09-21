package OOP_Basics;

class Student {
    int id ;
    String name;

    public void displayDetail() {

        System.out.println("in Class");
    }
}

public class AnonymousInner {

    public static void main(String[] args) {

        Student obj = new Student() 
        // now here we have created the Anonymous Inner Class
        // simply override the method
        // without extends (inheritance)
        {
            
            public void displayDetail() 
            {
            System.out.println(name + " : " + id + "\nin Anonymous Inner Class");
            }

        };

        obj.name = "Anushka";
        obj.id = 78; 

        obj.displayDetail();

        // look ek AnonymousInner$1.class bhi bani hai anonymous inner class ka sabut
    }
}
