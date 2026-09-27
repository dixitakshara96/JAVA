public class Searcher {
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 4, 9, 12, 15, 18, 21};
        int target = 18;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("Index: " + index);
    }
}