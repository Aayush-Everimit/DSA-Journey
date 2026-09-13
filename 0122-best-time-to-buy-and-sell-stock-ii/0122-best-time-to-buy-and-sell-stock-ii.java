class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int slow = 0;

        for (int fast = 1; fast < prices.length; fast++) {
            if (prices[slow] < prices[fast]) {
                profit += prices[fast] - prices[slow];
            }
            slow = fast; 
        }
        
        return profit;
    }
}
