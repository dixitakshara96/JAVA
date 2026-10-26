package Task13;
    
import java.util.HashMap;

public class IsomorphicStrings {


    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map1.containsKey(c1)) {
                if (map1.get(c1) != c2) {
                    return false;
                }
            } else {
                map1.put(c1, c2);
            }

            if (map2.containsKey(c2)) {
                if (map2.get(c2) != c1) {
                    return false;
                }
            } else {
                map2.put(c2, c1);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s1 = "egg";
        String s2 = "add";
        String s3 = "baa";
        String s4 = "hie";

        System.out.println("Isomorohic 's1' and 's2' :" + isIsomorphic(s1, s2));
        System.out.println("Isomorohic 's2' and 's3' :" + isIsomorphic(s2, s3));
        System.out.println("Isomorohic 's3' and 's4' :" + isIsomorphic(s3, s4));
        System.out.println("Isomorohic 's4' and 's1' :" + isIsomorphic(s4, s1));
    }
}

    

