package DSA.SlidingWindow;

public class CountGoodString {

    public static int countGoodString(String s) {

        int count = 0;

        for (int i = 0 ; i < s.length() - 2 ; i++ ) {

            char first = s.charAt(i);
            char second = s.charAt(i + 1);
            char third = s.charAt(i + 2);

            if( (first != second) && (second != third) && (third != first) ) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(" Good String: " + countGoodString( "abdsasdae"));
    }
    
}
