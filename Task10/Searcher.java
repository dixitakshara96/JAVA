public class Searcher {

    // Linear Search with step count
    // This going to return the first occurence
    static int linearSearch(int[] arr, int target) {
        int steps = 0;

        for (int i = 0; i < arr.length; i++) {
            steps++;

            if (arr[i] == target) {
                System.out.println("Linear -> Index: " + i);
                System.out.println("Linear Steps: " + steps);
                return i;
            }
        }

        System.out.println("Linear -> Not Found");
        System.out.println("Linear Steps: " + steps);
        return -1;
    }

    // Binary Search (Iterative) with step count
    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int steps = 0;

        while (low <= high) {
            steps++;

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                System.out.println("Binary -> Index: " + mid);
                System.out.println("Binary Steps: " + steps);
                return mid;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Binary -> Not Found");
        System.out.println("Binary Steps: " + steps);
        return -1;
    }

    // First occurrence using Binary Search
    static int firstOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;     // search left
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    // Insertion Index
    static int insertionIndex(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 4, 4, 4, 9, 12, 15, 18, 21};

        System.out.println("=== Target = 18 ===");
        linearSearch(arr, 18);
        binarySearch(arr, 18);

        System.out.println("\n=== Target = 4 ===");
        int first = firstOccurrence(arr, 4);
        System.out.println("First Occurrence Index: " + first);

        System.out.println("\n=== Target = 10 ===");
        int index = binarySearch(arr, 10);

        if (index == -1) {
            int insert = insertionIndex(arr, 10);
            System.out.println("Insert at Index: " + insert);
        }
    }
}