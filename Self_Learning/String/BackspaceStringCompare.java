package Self_Learning.String;

public class BackspaceStringCompare {
    
    public static boolean backspaceCompare(String s, String t) {

        // Dono strings ko process karke final strings banayenge
        StringBuilder s1 = new StringBuilder();
        StringBuilder t1 = new StringBuilder();

        // String s ko process karna
        for (int i = 0; i < s.length(); i++) {

            // Agar backspace (#) hai
            if (s.charAt(i) == '#') {

                // Agar StringBuilder empty nahi hai,
                // toh last character remove kar do
                if (s1.length() > 0) {
                    s1.deleteCharAt(s1.length() - 1);
                }
            }

            // Agar normal character hai,
            // toh StringBuilder mein add kar do
            else {
                s1.append(s.charAt(i));
            }
        }

        // String t ko process karna
        for (int i = 0; i < t.length(); i++) {

            // Agar backspace (#) hai
            if (t.charAt(i) == '#') {

                // Last character remove karna,
                // lekin empty StringBuilder se nahi
                if (t1.length() > 0) {
                    t1.deleteCharAt(t1.length() - 1);
                }
            }

            // Normal character ko add karna
            else {
                t1.append(t.charAt(i));
            }
        }

        // Dono processed strings ko compare karna
        return s1.toString().equals(t1.toString());
    }

    public static void main(String[] args ) {

        System.out.println("Strings are same: " + backspaceCompare("ad##", "d#c#"));
    }
}


