package OOP_Basics;

public class StaticAccess {

    int id;
    String name;
    static String college;

    public StaticAccess (int id , String name) {

        this.id = id ;
        this.name = name;
        StaticAccess.college = "BBDU";
    }

    void infoDisplay() {
        System.out.println("ID: " + id + "\nName: " + name + "\nCollege: " + college);
    }

    public static void main(String[] args) {

        StaticAccess stud1 = new StaticAccess(23, "Daisy");
        stud1.infoDisplay();
    }

    
}
