package Task12;


public class MirrorChecker {


    static boolean isMirrorWord(String word) {
        String allowed = "AHIMOTUVWXY";

        int left = 0;
        int right = word.length() - 1;

        while (left <= right) {
            char a = word.charAt(left);
            char b = word.charAt(right);

            // Both letters must be vertically symmetric
            if (allowed.indexOf(a) == -1 ||
                allowed.indexOf(b) == -1) {
                return false;
            }

            // Vertical mirror also requires palindrome order
            if (a != b) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    static boolean isWaterImageSame(String word) {
        String allowed = "BCDEHIKOX";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (allowed.indexOf(ch) == -1) {
                return false;
            }
        }

        return true;
    }

    
    static String mirrorTime(int h, int m) {
        // Validate a 12-hour clock time
        if (h < 1 || h > 12 || m < 0 || m > 59) {
            throw new IllegalArgumentException("Invalid clock time");
        }

        int total = (h % 12) * 60 + m;
        int mirror = (720 - total) % 720;

        int mirrorHour = mirror / 60;
        int mirrorMinute = mirror % 60;

        // Convert hour 0 back to 12
        if (mirrorHour == 0) {
            mirrorHour = 12;
        }

        return String.format("%02d:%02d", mirrorHour, mirrorMinute);
    }

    public static void main(String[] args) {

        System.out.println("HELLO: " + isMirrorWord("HELLO"));
        System.out.println("ABBA: " + isMirrorWord("ABBA"));
       
        System.out.println("BED: " + isWaterImageSame("BED"));
        System.out.println("CODE: " + isWaterImageSame("CODE"));
      
        System.out.println("03:00 -> " + mirrorTime(3, 0));
        System.out.println("12:30 -> " + mirrorTime(12, 30));
        System.out.println("11:45 -> " + mirrorTime(11, 45));
    }
}
