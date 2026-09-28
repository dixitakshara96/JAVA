package Code_Analysis.Task10;

public class Case7 {
    
    static int search(int[] a, int lo, int hi, int t) {
        if (lo > hi) return -1;
        int mid = (lo + hi) / 2;
        if (a[mid] == t) return mid;
        if (a[mid] < t) search(a, mid + 1, hi, t);
        else search(a, lo, mid - 1, t);
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        System.out.println(search(arr, 0, 3, 7));
    }
}

