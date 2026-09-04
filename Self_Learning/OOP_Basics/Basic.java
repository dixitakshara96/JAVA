package OOP_Basics;

public class Basic { 

    public static void main(String[] args) {

        // created an object instance 
        // stud1 is a reference variable (STACK)
        // object created in HEAP
        // stud1 (reference variable) pointing to the object
        // new keyword Dynamically Allocates the Memory of an object instance in HEAP
        // Student : class
        // Student() : the contructor (here default)
        // object instantiation
        Student stud1 = new Student();
        System.out.println("\n--- Student 1 ---");
        stud1.infoDisplay();

        // another object is created
        // but here we also given values
        // So first of all compiler checks if values are provided or not if not 
        // then it have the default value which are in class.

        // LHS -> COMPILE Time
        // RHS -> RUN Time
        Student stud2 = new Student();
        // separator or dot operator here it is used to access instance variables
        stud2.id = 32;
        stud2.name = "ABC"; 
        stud2.marks = 74.25f;

        System.out.println("\n--- Student 2 ---");
        stud2.infoDisplay();

    } 
}

// abhi kya hua na ki mene Main class ke ander yeh class bnaya toh error aaya reason kya hai find it.😅
// STUPID blueprint ke andar blueprint bnaogi 😑 . Don't mess up things . MAKE A CLEAR PICTURE😊
class Student {

        // not assigned any values
        // therefore has the default value (int 0 , String null, float 0.0)
        int id; 
        String name;
        float marks;

        // method 
        void infoDisplay() {
            System.out.println("ID: " + id + "\nName: " + name + "\nMarks: " + marks);
        }

        // abhi iss class ke andar humne Constructor nhi define kiya 
        // toh kya hua ki ek default Constructor apne aap ban gya hai
        // and uska saboot yeh hai ki ClassName.class (Student.class) file bani hai😁
    }