package Task11;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
         if (s.length() != t.length()) {
            return false;
        }

        // An array to store the character counts for the 26 lowercase English letters
        int[] charCounts = new int[26];

        // Increment counts for string s and decrement counts for string t
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        // If all frequencies are zero, the strings are anagrams
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {

        String name = "Akshara";
        String naam = "akrsaha";

        System.out.println("Anagram: " + isAnagram(name, naam));
    }
}