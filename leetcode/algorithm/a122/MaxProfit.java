package leetcode.algorithm.a122;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/26 下午3:57
 * @Description:
 */
public class MaxProfit {

    public int maxProfit(int[] prices) {

        int profit = 0;
        for (int i = 0; i < prices.length -2; i++) {
            if (prices[i] < prices[i+1]) {
                profit += prices[i+1] - prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
        System.out.println(maxProfit.maxProfit(new int[]{3, 7,1,4,3,2,10, 4}));
        System.out.println(maxProfit.maxProfit(new int[]{3, 8, 7, 6}));
        System.out.println(maxProfit.maxProfit(new int[]{1,1, 0}));
    }
}
