package Self_Learning.DSA;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int index = 0;
        
        for(int i = 0 ; i< nums.length ; i++) {

            if( nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        int[] array = {3,4,3,5,6,7,8};
    
        System.out.println("remove element:"+ removeElement(array, 6));
    
    }
    
}
