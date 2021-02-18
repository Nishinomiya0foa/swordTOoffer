package leetcode.algorithm.a121;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/26 下午3:29
 * @Description:
 */
public class MaxProfit {

    public int maxProfit(int[] prices) {

        // 遍历一次 每个数据时, 计算如果在今天卖出, 那么利润最大是多少?
        // 并记住这个卖出时的买入价
        int min = prices[0];
        int profit = 0;
        for (int i: prices) {
            profit = Math.max(i - min, profit);
            min = Math.min(i, min);
        }
        return profit;
    }

    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
        System.out.println(maxProfit.maxProfit(new int[]{7,1,4,3,2,10, 4}));
    }
}
