class Solution {
    public int maxProfit(int[] A) {
    //    int profit = 0, i = 0;
    //     int length = prices.length;
    //     while (i < length-1) {
    //         int currProfit = prices[i + 1] - prices[i];
    //         profit += currProfit > 0 ? currProfit :0;
    //         i++;
                
    //     }


    //     return profit;
    int maxProfit = 0;
        int currMin = Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++) {
            if(currMin > A[i]) {
                currMin = A[i];
            }
            int profit = A[i] -currMin;
            maxProfit +=profit;
            if(maxProfit > 0) currMin = A[i];


        }

        return maxProfit;


        
    }
}