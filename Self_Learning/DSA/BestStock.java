package Self_Learning.DSA;

public class BestStock {

    // intial logic but Time exceeded
    // public int maxProfit(int[] prices) {
    //     int max = 0;

    //     for(int i = 0 ; i < prices.length ; i++) {

    //         for(int j = i+1 ; j < prices.length ; j++) {
    //             int diff = prices[j] - prices[i];

    //             if( max < diff) {
    //                 max = diff;
    //             }
    //         }
    //     }

    //     if ( max != 0 ) {
    //         return max;
    //     }
    //     return 0;
    // }

    // better solution Less Time Complexity 
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
            minPrice = prices[i];
            } else {
                int currentProfit = prices[i] - minPrice;
                if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
                }
            }
        }

        if ( maxProfit != 0 ) {
            return maxProfit;
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] stock = {3, 6, 2, 8, 4};

        System.out.println("Maximum Profit : " + (maxProfit(stock)));
    }
}
    

