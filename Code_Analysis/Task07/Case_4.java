package Code_Analysis.Task07;
import java.util.ArrayList;

public class Case_4 {

    public static void main(String[]args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10); // inserting 10 at index 0 .
        list.add(20); // inserting 20 at index 1 .
        list.add(30); // inserting 30 at index 2 .

        // this going to delete the value at index 1 which is 20 here.
        list.remove(1);

        System.out.println(list);
    }
    
}
