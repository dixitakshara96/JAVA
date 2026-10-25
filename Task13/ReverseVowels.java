package Task13;

public class ReverseVowels {

    public static String reverseVowels(String s) {

        int left = 0;
        int right = s.length() - 1;
        String vowels = "AEIOUaeiou";
        char[] arr = s.toCharArray();

        while( left < right) {
            if ( (vowels.indexOf(arr[left]) != -1) && (vowels.indexOf(arr[right]) != -1)) {

                char c = arr[left];
                arr[left] = arr[right];
                arr[right] = c;

                left++;
                right--;
            }   

            else if ( (vowels.indexOf(arr[left]) == -1)){
                left++;
            }   

            else if ( (vowels.indexOf(arr[right]) == -1)){
                right--;
            }   

        }
        return new String(arr);
    }

    public static void main(String[] args) {

        System.out.println("Reverse Vowels of 'IceCrEam' : " + reverseVowels("IceCrEam"));
        System.out.println("Reverse Vowels of 'LeetcOdE' : " + reverseVowels("leetcOdE"));
        System.out.println("Reverse Vowels of 'Jahnvi' : " + reverseVowels("Jahnvi"));
    }
}