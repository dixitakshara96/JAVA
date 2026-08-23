package Day07;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;

public class CollectionBasics {

    public static void main(String[]args) {
        ArrayList<Integer> array = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();

        HashMap<Integer, String> student = new HashMap<>();
        student.put(420, "ABC");
        student.put(421, "XYZ");
        student.put(422, "PQR");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 Elements in array: ");
        array.add(sc.nextInt());
        array.add(sc.nextInt());
        array.add(sc.nextInt());
        array.add(sc.nextInt());
        array.add(sc.nextInt());

        System.out.println("Original List\t " + array);

        System.out.println("---MENU---\n");
        System.out.println("1. Add Another Element");
        System.out.println("2. Remove one Element");
        System.out.println("3. Search for a number");
        System.out.println("4. Print size");
        System.out.println("5. Print all Elements using enhanced for loop");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("\nAdd one element: ");
                array.add(sc.nextInt());
                break;
            
            case 2 :
                array.removeLast();
            
            case 3 :
                System.out.println("\nEnter target: ");
                int target = sc.nextInt();

                for (int num : array) {
                    if (num == target) {
                        System.out.println("\nTarget found in array\t" + target +"\t" + array);
                    }
                    else 
                        System.out.println("\nTarget NOT FOUND\t" + target + "\t" + array);
                    
                }
                break;

            case 4:
                System.out.println("\nSize of array: " + array.size());
                break;
            
            case 5 :
                System.out.println("\n---ALL ELEMENTS---\n");

                for (int num : array) {
                    System.out.println(num);                    
                }
                break;
            default :
                System.out.println("Invalid Choice");
                break;
        }
        

        for (Integer num : array) {
            set.add(num);  
        }

        System.out.println("\nUnique Elements: " + set);


        System.out.println("---HASHMAP MENU---\n");
        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. Search for a student using ID");
        System.out.println("4. Search for key");
        System.out.println("5. Print all entries");
        System.out.println("Enter your choice");
        int operation = sc.nextInt();
        sc.nextLine();



        switch (operation) {
            case 1:
                System.out.println("\nEnter ID: ");
                int id = sc.nextInt();

                System.out.println("Enter student name: ");
                String name = sc.nextLine();

                student.put(id , name);
                break;
            
            case 2 :
                System.out.println(student);
                System.out.println("Enter student ID to remove: ");
                int ID = sc.nextInt();

                student.remove(ID);
                break;
            
            case 3 :
                System.out.println("\nEnter target ID: ");
                int target = sc.nextInt();

                for (int rollNo : student.keySet()) {
                    if (rollNo == target) {
                        System.out.println("\nstudent found \t" + rollNo +"\t" + student.get(rollNo));
                    }
                    else 
                        System.out.println("\nStudent ID NOT FOUND\t" );
                }
                break;

            case 4:
                System.out.println("\nEnter target key: ");
                int key = sc.nextInt();

                for (int rollNo : student.keySet()) {
                    if (rollNo == key) {
                        System.out.println("\nKey found \t" + rollNo);
                    }
                    else 
                        System.out.println("\nKey NOT FOUND\t" );
                }
                break;
            
            case 5 :
                System.out.println("\n---ALL ENTRIES---\n");

                for (int num : student.keySet()) {
                    System.out.println(num + "|" + student.get(num));                    
                }
                break;

            default :
                System.out.println("Invalid Choice");
                break;
        }

        System.out.println("Final");
        System.out.println("Array" + array);
        System.out.println("Set" + set);
        System.out.println("Student Data" + student);

    }
}
    
