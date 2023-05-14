package Array1D;

public class Q3 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(buySellStock(prices));
    }
    public static int buySellStock(int[] prices) {
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0 ; i < prices.length; i++){
            if(buyingPrice < prices[i]) {
                int profit = prices[i] - buyingPrice;
                maxProfit = Math.max(profit,maxProfit);
            } else {
                buyingPrice = prices[i];
            }
        }
        return maxProfit;
    }

}
