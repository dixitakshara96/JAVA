package Code_Analysis.Task10;

import java.util.ArrayList;
import java.util.Arrays;
public class Case10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 10, 15, 10));
        System.out.println(list.indexOf(10));
        System.out.println(list.lastIndexOf(10));
        System.out.println(list.indexOf(99));
        list.remove(Integer.valueOf(10));
        System.out.println(list.indexOf(10));
    }
}