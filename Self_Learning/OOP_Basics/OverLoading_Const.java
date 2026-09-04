package OOP_Basics;

public class OverLoading_Const {

    public static void main (String[]args) {

        Student stud1 = new Student();
        System.out.println("\n--- Student 1 ---");
        stud1.infoDisplay();

        Student stud2 = new Student(43, "Alice" , 85.24f );
        System.out.println("\n--- Student 2 ---");
        stud2.infoDisplay();

        Student stud3 = new Student();
        stud3.name = "Michael";
        stud3.id = 75;
        stud3.marks = 69.6f;

        System.out.println("\n--- Student 3 ---");
        stud3.infoDisplay();

    }
    
}

class Student {

    int id;
    String name;
    float marks;

    // but now you need to write this 
    // aise nhi ki default hai toh aajayega apne aap ❌
    // you have to explicitly write this now ✅
    Student() {
        // here this keyword is use to call Constructor
    }

    Student(int id , String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void infoDisplay() {
        System.out.println("ID: " + id + "\nName: " + name + "\nMarks: " + marks);
    }


}
