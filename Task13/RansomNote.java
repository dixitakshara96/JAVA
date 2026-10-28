package Task13;

public class RansomNote {
   
    public static boolean canConstruct(String ransomNote, String magazine) {

        // Ek array banaya jisme har lowercase letter (a-z) ki frequency store hogi
        int[] freq = new int[26];

        // Step 1: Magazine ke saare characters ki frequency count karo
        for (int i = 0; i < magazine.length(); i++) {

            // Character ko 0-25 ke index mein convert kar rahe hain
            // Example: 'a' - 'a' = 0, 'b' - 'a' = 1
            int index = magazine.charAt(i) - 'a';

            // Is character ki available frequency 1 se increase kar do
            freq[index]++;
        }

        // Step 2: RansomNote ke har character ko magazine mein check karo
        for (int i = 0; i < ransomNote.length(); i++) {

            // RansomNote ke current character ka index nikalo
            int index = ransomNote.charAt(i) - 'a';

            // Agar frequency 0 hai, toh ye character magazine mein available nahi hai
            // Ya phir is character ki saari occurrences pehle hi use ho chuki hain
            if (freq[index] == 0) {
                return false;
            }

            // Character use karne ke baad uski available frequency 1 se kam kar do
            // Isse ek hi character ko multiple times use nahi kar sakte
            freq[index]--;
        }

        // Agar ransomNote ke saare characters successfully mil gaye,
        // toh ransomNote construct kiya ja sakta hai
        return true;
    }

    public static void main(String[] args) {

        System.out.println( "Can we comnstruct 'abbd' from 'abcdab' : " + canConstruct("abbd" , "abcdab"));
        System.out.println( "Can we comnstruct 'aab' from 'abcdab' : " + canConstruct("aab" , "abcdab"));
        System.out.println( "Can we comnstruct 'bbd' from 'abbadabaachabaa' : " + canConstruct("bbd" , "abbadabaachabaa"));
    }
}
    

