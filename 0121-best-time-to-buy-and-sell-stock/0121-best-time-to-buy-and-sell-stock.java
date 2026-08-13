class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxprofit = 0;
        for(int i=0 ;i<prices.length ; i++){
            if(maxprofit < prices[i] - min){
                maxprofit = prices[i] - min;
            }
            if(prices[i] < min){
                min = prices[i];
            }
        }
        return maxprofit;
    }
}