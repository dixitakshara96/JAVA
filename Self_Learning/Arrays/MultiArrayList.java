package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList< ArrayList<Integer> > list = new ArrayList<>(); // inside this blue parenthesis we can pass capacity but but but Dynamic hai toh koi mtlb nhi hai

        for (int i = 0; i < 3 ; i++) {
                // initializing each arraylist
                // important
                list.add(new ArrayList<>());
        }

        System.out.println("Enter elements: ");
        for (int i = 0 ; i < 3 ; i++) {

            for (int j = 0 ; j < 3 ; j++) {
                // .get(i) is to access row and .add() is to insert the element
                list.get(i).add(sc.nextInt());
            }
        }

        // ab yaha par ArrayList<Integer> likha hai kyun ? because ab har ek row ek ArrayList hai aur hum usko print kra rhe hai .
        for (ArrayList<Integer> arr : list) {
            System.out.println(arr);
        }

        System.out.println("\n---Multi D ARRAYLIST---");
        System.out.println(list);

    }
}
