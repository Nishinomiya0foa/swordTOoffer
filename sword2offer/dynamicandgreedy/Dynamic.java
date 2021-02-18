package sword2offer.dynamicandgreedy;

import java.util.Arrays;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/8 下午1:57
 * @Description:
 *
 * 动态规划
 */
public class Dynamic {

    /**
     *
     * @param n
     * @return
     * 动态规划, 剪绳子, 使得所有段乘积为最大
     * 解: 第一刀时, 有n-1种选择, 因此 f(n)=max(f(i)*f(n-i))   --> 这是自顶而下的思想,会有许多重复计算
     * 解2: 自底而上, 绳子长度为2时, 乘积1; 绳子3时,乘积最大2;绳子4时,乘积最大4...
     * 核心思想: f(n)=max(f(i)*f(n-i)) 切法都在之前的最优解里了
     */
    public int cutRope(int n) {
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }

        int max = 0;
        int[] p = new int[n+1];
        p[0] = 0;
        p[1] = 1;
        p[2] = 2;
        p[3] = 3;  // p里存的是长度i时乘积的最大值, TODO 为什么要包含不剪的情况?

        for (int i = 4; i < n+1; i++) {  // 这层遍历算出每段长度的最优解
            max = 0;
            for (int j = 1; j<=i/2; j++) {  // j<=i/2的原因是减少重复计算
                                            // 遍历每种剪法,算出最大值,存到p
                int pro = p[j] * p[i-j];  // j + (i-j) = i; 表示绳子剪成的两段
                if (max < pro) {
                    max = pro;
                }
                p[i] = max;
            }
        }
        max = p[n];
        System.out.println(Arrays.toString(p));
        return max;
    }

    public static void main(String[] args) {
        Dynamic dy = new Dynamic();
        System.out.println(dy.cutRope(9));
    }
}
