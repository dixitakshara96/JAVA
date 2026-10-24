package Task13;
import java.util.HashSet;

class Solution {
    public static boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();
        int num = n;

        // why num != 1 is better to write than num >= 1 
        // when we write num >= 1 toh ek baar loop chalta hai 
        // whereas num != 1 mai ek baar bhi nhi chalta aur sidha true
        // efficiency acchi hai isse (fast ho rha hai)

        while (num != 1 && !set.contains(num)) {

            set.add(num);
            int sum = 0;

            while (num > 0) {
                
                sum += (num % 10) * (num % 10);
                num = num / 10;
            }

            // yeh nhi bhi likho tabh bhi chalega as at last hum num == 1 hi return kra rhe hai 
            // if (sum == 1 ) return true;

            num = sum;
        }
        // ab yeh imp hai par kyun
        // aisa isliye kyunki humara ek EdgeCase hai jab n = 1 hua toh
        // ab kyunki humari while ki condition hi yeh hai when 
        return num == 1;
    }

    public static void main(String[] args) {

        System.out.println("Happy Number: " + isHappy(19));
        System.out.println("Happy Number: " + isHappy(1));
        System.out.println("Happy Number: " + isHappy(24));
        System.out.println("Happy Number: " + isHappy(37));
    }
}