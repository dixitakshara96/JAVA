package Arrays;

import java.util.Arrays;

// acchaaaaaa ab na kya hai ki iska constructor toh likha nhi hai mene toh kya hua ki ek separate Student.class file bani hai 
class Student {

    int id;
    String name;
    int marks;
}

public class ArrayOfObj {

    public static void main(String[] args) {

        Student stud1 = new Student();
        stud1.id = 1;
        stud1.name = "Ansh";
        stud1.marks = 86;

        Student stud2 = new Student();
        stud2.id = 2;
        stud2.name = "Naman";
        stud2.marks = 74;

        Student stud3 = new Student();
        stud3.id = 3;
        stud3.name = "Shivam";
        stud3.marks = 98;

        // we have created an Array of the objects
        // simple just like normal array
        // initialization
        Student[] student = new Student[3];
        student[0] = stud1;
        student[1] = stud2;
        student[2] = stud3;

        for (int i = 0; i < student.length; i++) {

            System.out.println("\n---Address---");

            System.out.println(student[i]);

            System.out.println(student[i].id + ":" + student[i].name + ":" + student[i].marks);
        }

        for (Student stud : student) {
            System.out.println("\nID: " + stud.id + "\nName: " + stud.name + "\nMarks: " + stud.marks);
        }

    }

}
