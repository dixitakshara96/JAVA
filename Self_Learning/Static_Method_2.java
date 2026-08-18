package Self_Learning;

public class Static_Method_2 {

    public static class Student {

        // instance Variable it belongs to a {} block scope only
        // this will hold default value ABC when no value is passed inside name 
        String name = "ABC"; 


        // This is static method it is a class behavior (class oriented) it doesn't need any object
        static void method1() {
            System.out.println("Hello Students ! ");
        }

        // This is an instance method it required object (object behavior or oriented)
        void method2 () {
            System.out.println("Hello\t"+ name);
        }
    }

    public static void main(String[] args) {
        Student stud1 = new Student();
        // stud1.name = "XYZ";
        stud1.method2();
        Student.method1() ;

        System.out.println();

    }
}
