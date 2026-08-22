package Self_Learning;


    class Parent {
        int id;
        String name;

        void ParentName() {
            System.out.println("Parent Name: " + name);
        }

        void ParentId() {
            System.out.println("Parent ID :" + id) ;
        }
    }

    class Child extends Parent {
        int childID;
        String childName;

        void ChildName() {
            System.out.println("Child Name:" + childName);
        }
        void ChildID() {
            System.out.println("Child ID:" + childID);
        }
    }

public class OOP_Concept {

    public static void main(String []args) {
        
        Child c1 = new Child();
        c1.childID = 1231;
        c1.childName = "ABC" ;
        c1.name = "XYZ";
        c1.id = 1323;

        c1.ChildID();
        c1.ChildName();
        c1.ParentId();
        c1.ParentName();


        
    }
    
}
