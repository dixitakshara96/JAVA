package OOP_Basics;

public class FinalObject {

    public static void main(String[] args) {

        final Stud stud1 = new Stud();

        // here, you can't re-initialize the value of final primitive DT
        // stud1.grade = 6;
        stud1.name = "ABC";
        System.out.println("\n---Student 1 Info---");
        stud1.info();

        Stud stud2 = new Stud();

        // here, you can't assign (refer) the final reference object to some another object
        // stud1 = stud2;

        stud2.name = "XYZ";
        System.out.println("\n---Student 2 Info---");
        stud2.info();

        // here, but you can modify the value of instance variable of a final object (reference)
        stud1.name = "PQR";
        System.out.println("\n---Student 1 Updated Info---");
        stud1.info();
    }
    
}

class Stud {
    final int grade = 10;
    String name;

    void info() {
        System.out.println("Name: " + name + "\nClass: " + grade );
    }
    
}
