package Code_Analysis.Task07;

import java.util.HashSet;

public class Case_5 {

    public static void main(String[]args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(20);

        System.out.println(set.size());

        // Blown my mind 😯
        System.out.println(set);
    }
    
}
