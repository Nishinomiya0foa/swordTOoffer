package leetcode.algorithm.a70;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/25 上午10:19
 * @Description:
 */
public class ClimbStairs {

    // 怕楼梯 的方法  动态规划
    // f(x) = f(x-1) + f(x-2)
    public int climbStairs(int n) {
        int p = 0, q = 0, r = 1;  // 0->0  0->1  都只有1种方法
        for (int i = 1; i <=n ; i++){  // 时间复杂度 O(n)
            p = q;
            q = r;
            r = p+q;  // 滚动法  空间复杂度 O1
        }
        return r;
    }

    public static void main(String[] args) {
        ClimbStairs climbStairs = new ClimbStairs();
        System.out.println(climbStairs.climbStairs(3));
    }
}
