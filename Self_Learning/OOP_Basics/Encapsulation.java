package OOP_Basics;

// Encapsulation 
//  1. variables are private : instance variable
//  2. methods are public : setter method to set the value and getter method to get the vale of instance variable


class Encap {

    // instance variable
    // jo ki humne private kar diye hai (filling kardi humne ab obj nhi access kar payega isse)
    private int id; 
    private String name;

    // Getter method for Id
    // lekin value toh use karenge 
    public int getId() {
        return this.id ;
    }

    // Getter method for Name
    public String getName() {
        return this.name ;
    }

    // Setter method for Name
    // kuch value bhi toh set karenge
    public void setName(String name) {
        this.name = name;
    }

    // Setter method for Id
    public void setId(int id) {
        this.id = id; 
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Encap stud1 = new Encap();

        // can't access this error ayega
        // stud1.id = 34;

        stud1.setId(23);
        stud1.setName("Aradhya");
        
        System.out.println("Name: " + stud1.getName() + "\nId: " + stud1.getId());
    }    
}
