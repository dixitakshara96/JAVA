package Task12;
import java.util.Arrays;

public class ReverseString {

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1 ;

        while( left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
        System.out.println("Reversed string: " + Arrays.toString(s));
    }

    public static void main(String[] args) {
        char[] vowels = {'a','e','i','o','u'};
        System.out.println("Original: " + Arrays.toString(vowels));
        reverseString(vowels);
    }
}
