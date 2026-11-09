package DSA.TwoPointers;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {

        // we have used Two Pointers

        int left = 0;
        int right = height.length - 1;
        int max_area = 0;

        while (left < right) {

            // area = length *  breadth
            // here length = difference of length of x - axis between both the lines (right - left)
            // here breadth = minimum height of one of the line 
            int area = (right - left) * ( Math.min( height[left] , height[right] ) );

            max_area = Math.max (max_area , area);

            if( height[left] < height[right] ) {
                left++ ;
            }
            else {
                right--;
            }

        }
        return max_area;
    }

    public static void main(String[] args) {

        int[] lines = { 3, 6, 4, 7, 2 , 8};

        System.out.println("Max Area : "  + maxArea(lines));
    }
    
}
