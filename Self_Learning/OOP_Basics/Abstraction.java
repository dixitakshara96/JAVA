package OOP_Basics;

abstract class Security {
    int id;
    int password;

    abstract void infoDisplay();

}

class Admin extends Security {
    
    void infoDisplay() 
    {
        System.out.println("Password: " + password + "\nId: " + id);
    }

}


public class Abstraction {

    public static void main(String[] args) {

        Admin admin = new Admin();
        admin.id = 234;
        admin.password  = 245660;

        admin.infoDisplay();

        // this line is showing that this obj can't be instantiate because of the 'abstract' keyword.
        // Security secure = new Security(); 

    }
    
}
