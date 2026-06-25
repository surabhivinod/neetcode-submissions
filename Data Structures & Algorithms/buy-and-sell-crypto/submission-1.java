class Solution {
    public int maxProfit(int[] prices) {

        int l = 0; 
        int profit = 0;
        int result = 0;

        for(int r = 0; r< prices.length; r++){
            while(prices[l]> prices[r]){
                l++;
            }

            profit = prices[r]- prices[l];
            result = Math.max(result, profit);


        }
        return result;
    }
}
