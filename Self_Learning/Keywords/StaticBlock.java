package Keywords;

class Employee {

    double salary;
    String designation;
    String name;

    // 
    static {
        System.out.println("Static Block humesha pehle hi run hoga ");
        // class banti hai ussi time par hi static bhi load ho jata hai
    }

    Employee (String name, String designation, double salary) {

        this.salary = salary;
        this.designation = designation;
        this.name = name;
    }

    void infoDisplay() {

        System.out.println("\nName: " + this.name + "\nDesignation: " + this.designation + "\nSalary: " + this.salary);
    }

    static {
        System.out.println("Static BLock 2 farak nhi padhta chahe pehle likho ya last mai");
    }

}

public class StaticBlock {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Raunit" , "Software Engineer" , 58769.37);

        emp1.infoDisplay();
    }
    
}
