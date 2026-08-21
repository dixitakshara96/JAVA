package Self_Learning;

public class OOP_Simple {

    int universityRoll ;
    String studentName;
    String course ;

    void details() {
        System.out.println("Name: " +studentName) ;
        System.out.println("Roll No. : " + universityRoll) ;
        System.out.println("Course: " + course) ;

    }

    public static void main(String[] args) {
        OOP_Simple stud = new OOP_Simple() ;
        stud.studentName = "ABC" ;
        stud.universityRoll = 232323213;
        stud.course = "Btech" ;

        stud.details();
    }
    
}
