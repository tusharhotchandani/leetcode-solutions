class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxp = 0;
        for(int i=0 ;i<prices.length ; i++){
            if(maxp < prices[i] - min){
                maxp = prices[i] - min;
            }
            if(prices[i] < min){
                min = prices[i];
            }
        }
        return maxp;
    }
}