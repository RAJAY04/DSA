public class BuyAndSellStocks {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int least_so_far = Integer.MAX_VALUE;
        int overall_profit = 0;
        int profit_if_sold_today = 0;
            for (int i = 0; i < prices.length; i++) {
                if(prices[i]<least_so_far){
                    least_so_far=prices[i];
          }
                profit_if_sold_today= prices[i]-least_so_far;
                if(overall_profit<profit_if_sold_today){
                    overall_profit=profit_if_sold_today;
                }
      }return overall_profit;
    }
}

//    int max = Integer.MIN_VALUE;
//        for (int i = 0; i < prices.length-1; i++) {
//        for (int j = i+1; j < prices.length; j++) {
//        if(prices[j]-prices[i] > max){
//        max=prices[j]-prices[i];
//        }
//        }
//        }if(max>0) return max;
//        return 0;