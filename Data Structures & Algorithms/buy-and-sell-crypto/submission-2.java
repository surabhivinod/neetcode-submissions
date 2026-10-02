class Solution {
    public int maxProfit(int[] prices) {

        //two pointers to track
        //math.max
        //what day shuold you buy and what day should you sell to get the max profit

        int left = 0; 

        int right =1;

        int maxP = 0;

        while(right< prices.length){
            if(prices[left] < prices[right]){
                int profit = prices[right] - prices[left];
                maxP = Math.max(maxP, profit);
            } else {
                int profit = prices[right] - prices[left];
                maxP = Math.max(maxP, profit);
                left = right;
            }

            right++;
        }

        return maxP;

       //if right pointer > left, move left pointer up 



        
    }
}
