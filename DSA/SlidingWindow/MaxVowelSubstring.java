package DSA.SlidingWindow;

// Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.


 
public class MaxVowelSubstring {

    public static int maxVowels(String s , int k) {

        int vowel = 0;
        int maxVowel = 0;

        for( int i = 0 ; i < k ; i++) {

            if("AEIOUaeiou".indexOf(s.charAt(i)) != -1) {
                vowel++;
            }
        }

        maxVowel = vowel;

        for(int i = k ; i < s.length() ; i++) {

            if("AEIOUaeiou".indexOf(s.charAt(i - k)) != -1) {
                vowel--;
            }

             if ("aeiou".indexOf(s.charAt(i)) != -1) {
                vowel++;
            }

            maxVowel = Math.max(maxVowel, vowel);

            // Maximum possible answer is k
            if (maxVowel == k) {
                return k;
            }
        }

        return maxVowel;
    }

    public static void main(String[] args) {

        System.out.println("Max no. of vowels contained in substring of 3 :" + maxVowels("akshara", 3));
        System.out.println("Max no. of vowels contained in substring of 3 :" + maxVowels("pankha", 3));
    }
}


