package Arrays;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int min = prices[0] , max_profit = 0 , cur_profit = 0;
        for(int i = 1 ; i < prices.length ; i++){
            cur_profit = prices[i] - min;
            max_profit = Math.max(max_profit,cur_profit);
            min = Math.min(min,prices[i]);
        }return max_profit;
    }
}
