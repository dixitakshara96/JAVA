package Keywords;

// final class ka mtlb ab aap uss class ki koi subclass nhi bna skte
final class Student {

    int rollno ;
    String name;

    Student (int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void infoDisplay() {
        System.out.println("Name: " + this.name + "\nRollNo: " + this.rollno);
    }
}

public class Final {

    public static void main(String[] args) {
        final int id = 34;
        // final matlab final ab nhi change kar skte
        // for variable

        Student stud = new Student(11, "Hitesh");
        stud.infoDisplay();

        // final class ka mtlb yeh nhi hai ki obj ki values nhi change ya update kar skte hai 
        // bas yeh hai ki class ko ab koi inherit nhi kar skta
        stud.name = "Navin";
        System.out.println("\nUpdated");
        stud.infoDisplay();
    }
}
