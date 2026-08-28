package Code_Analysis.Task07;

import java.util.ArrayList;

public class Case_8 {

    public static void main(String[]args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for ( int i = 0; i < list.size(); i++) {

            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
    
}
