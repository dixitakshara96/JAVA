package Task12;

public class PairsAndWindows {
    public static void main(String[] args) {
    // Part A: sorted array mein saare pairs jinka sum = target
        int[] sorted = {1, 3, 4, 5, 7, 9, 10, 12};
        int target = 13;

        int left = 0;
        int right = sorted.length - 1;
        // for (int i = 0; i < sorted.length; i++) {
        //     for (int j = i + 1; j < sorted.length; j++) {

            while (left < right) {

                if (sorted[left] + sorted[right] == target) {
                    System.out.println(sorted[left] + " + " + sorted[right]);
                }
                left++;
                right--;
            }
                
        //     }
        // }
    // Part B: kisi bhi 3 consecutive elements ka max sum
        int[] marks = {4, 2, 12, 1, 7, 8, 3, 9};
        int k = 3;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i + k <= marks.length; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += marks[j];
            }
            max = Math.max(max, sum);
        }
        System.out.println("Max window sum: " + max);
    }
}
