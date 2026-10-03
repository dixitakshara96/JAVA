package Task11;

import java.util.HashMap;

public class FirstUniqueChar {

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();

        for(Character ch : s.toCharArray())  {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for( int i = 0 ; i < s.length() ; i++) {
            if (freq.get(s.charAt(i)) == 1) {
                return i;
            }
            
        }
        return -1;
    }

    public static void main(String[] args) {
        String name = "Akshara";

        int idx = firstUniqChar(name);

        System.out.println(idx);
    }
}

