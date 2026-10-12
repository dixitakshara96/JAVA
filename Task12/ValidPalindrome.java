package Task12;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        // Convert to lowercase and change to a char array
        char[] lowercase = s.toLowerCase().toCharArray();
        int left = 0;
        int right = lowercase.length - 1;

        while (left < right) {

            // If the left character is not alphanumeric, skip it
            if (!Character.isLetterOrDigit(lowercase[left])) {
                left++;
                // continue is quite important yeh nhi kiya toh phir niche wala left++ and right-- chal jayega🥲 
                continue; // Move to the next loop iteration immediately
            }

            // If the right character is not alphanumeric, skip it
            if (!Character.isLetterOrDigit(lowercase[right])) {
                right--;
                continue; // Move to the next loop iteration immediately
            }

            // If both are alphanumeric, compare them
            if (lowercase[left] != lowercase[right]) {
                return false;
            }
            
            // Move both pointers inward if they match
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Palindrome: " + isPalindrome("A cat sat on the sofa"));
        System.out.println("Palindrome: " + isPalindrome("A man, a plan, a canal: Panama"));
    }
}
