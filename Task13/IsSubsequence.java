package Task13;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        
        int i = 0;
        int j = 0;

        if ( s.length() != 0 ) {

            for(j = 0 ; j < t.length() ; j++) {
                if( s.charAt(i) == t.charAt(j)) i++;
                if( i == s.length()) return true;
            }

            
        }

        else if ( s.length() == 0 ){
            return true;
        }
        

        return false;
    }

    public static void main(String[] args) {

        System.out.println("IsSubsequence : " + isSubsequence("ace","abcdef" ));
        System.out.println("IsSubsequence : " + isSubsequence("fli","weofqeiaul" ));
        System.out.println("IsSubsequence : " + isSubsequence("fli","asfojlwri" ));
    }
}
