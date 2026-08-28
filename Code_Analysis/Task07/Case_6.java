package Code_Analysis.Task07;

import java.util.HashMap;

public class Case_6 {

    public static void main(String[]args) {

        HashMap<Integer , String> map = new HashMap<>();

        map.put(101, "A");
        map.put(102, "B");
        map.put(101, "C");

        System.out.println(map.get(101));
        System.out.println(map.size());
        System.out.println(map);
    }
    
}
