package Task12;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        for (char ch : "listen".toCharArray()) c1[ch - 'a']++;
        for (char ch : "silent".toCharArray()) c2[ch - 'a']++;
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
        System.out.println(Arrays.equals(c1, c2));
    }
    
}
