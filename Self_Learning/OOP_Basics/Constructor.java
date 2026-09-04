package OOP_Basics;

public class Constructor {

    public static void main(String[]args) {

        // object creation + instantiation (ek saath)
        Student stud1 = new Student ( 89, "Rohit" , 52.42f );
        System.out.println("\n--- Student 1 ---");
        stud1.detailDisplay();

        Student stud2 = new Student ( 74, "Priya" , 96.74f);
        System.out.println("\n--- Student 2 ---");
        stud2.detailDisplay();

    }
    
}

class Student {
    int id;
    String name;
    float marks;

    // the method which has same name as that of class is Constructor
    // if we don't write it in class then there is a default one 
    // WHY do we need this?

    Student(int id, String name, float marks) {

        // WHY? WHAT? 
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void detailDisplay() {
        System.out.println("ID: " + id + "\nName: " + name + "\nMarks: " + marks);
    }
}
