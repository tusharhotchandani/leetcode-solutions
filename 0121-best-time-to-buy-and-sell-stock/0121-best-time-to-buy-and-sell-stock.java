class Solution {
    public int maxProfit(int[] prices) {
        int min = 10001;
        int maxp = 0;
        for(int i=0 ;i<prices.length ; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            if(maxp < prices[i] - min){
                maxp = prices[i] - min;
            }
        }
        return maxp;
    }
}