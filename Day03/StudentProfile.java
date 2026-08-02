package Day03;

import java.util.Scanner;

public class StudentProfile {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name= sc.nextLine();

        System.out.println("Enter your age: ");
        int age=sc.nextInt();

        sc.nextLine();
        System.out.println("Enter your course: ");
        String course= sc.nextLine();

        System.out.println("Enter your college: ");
        String college= sc.nextLine();

        System.out.println("------ Student Details ------");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Course: "+course);
        System.out.println("College: "+college);

    }
    
}
