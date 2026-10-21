package Task12;

public class PairsAndWindows {
    public static void main(String[] args) {
    // Part A: sorted array mein saare pairs jinka sum = target
        int[] sorted = {1, 3, 3, 5, 7, 9, 10, 12};
        int target = 13;
        int twopointer = 0;
        int normal = 0;

        // why starting the pointer with 1 and end pointer with length -2 
        // because we need to handle the duplicate as well 
        // so we compare the current value with the past value 
        int left = 1;
        int right = sorted.length - 2;


        // for (int i = 0; i < sorted.length; i++) {
        //     for (int j = i + 1; j < sorted.length; j++) {

            while (left < right) {

                twopointer++;

                if( ( sorted[left-1] !=  sorted[left] ) || ( sorted[right+1] != sorted[right] ) ) {
                    if (sorted[left-1] + sorted[right+1] == target ) {
                        System.out.println(sorted[left-1] + " + " + sorted[right+1]);
                    }
                    left++;
                    right--;
                }

                else if (sorted[left-1] ==  sorted[left]) {
                    left++;
                }
                else if (sorted[right+1] ==  sorted[right]) {
                    right--;
                }
            }

            for (int i = 0; i < sorted.length; i++) {
                normal++;
                for (int j = i + 1; j < sorted.length; j++) {
                    if (sorted[i] + sorted[j] == target) {
                        System.out.println(sorted[i] + " + " + sorted[j]);
}
                }
            }
                
        //     }
        // }
    // Part B: kisi bhi 3 consecutive elements ka max sum
        int[] marks = {4, 2, 12, 1, 7, 8, 3, 9};
        int k = 3;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int slidingwindow = 0;
        int normal1 = 0;

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];   

            slidingwindow++;

            if (i >= k - 1) {                 
                // naya element andar
                // window ka size k ho gaya
                max = Math.max(max, sum);
                sum -= marks[i - k + 1];        
                // sabse purana element bahar
            }
        }
        
        for (int i = 0; i + k <= marks.length; i++) {

            normal1++;

            int add = 0;

            for (int j = i; j < i + k; j++) {
                add += marks[j];
            }
                max = Math.max(max, add);
        }

        System.out.println("Max window sum: " + max);


        System.out.println("\n---COMPARISON---\n");
        System.out.println("PART A : Aam Zindagi:" + normal + "\nMentos Zindagi (Two Pointers):" + twopointer);
        System.out.println("\nPART B : Aam Zindagi:" + normal1 + "\nMentos Zindagi (Sliding Window):" + slidingwindow);
    }
}
