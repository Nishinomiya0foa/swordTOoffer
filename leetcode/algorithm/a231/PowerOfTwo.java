package leetcode.algorithm.a231;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/3 下午3:59
 * @Description:
 */
public class PowerOfTwo {

    /**
     * n是不是2的幂次方
     * @param n
     * @return
     *
     * 1. 暴力法
     * 2. ?
     */
    public boolean isPowerOfTwo(int n) {

        double x = 0;
        int num = 0;
        while (x < n) {
            x = Math.pow(2, num);
            if (x == (double) n) {
                return true;
            }
            else if (x > (double) n) {
                return false;
            }
            num += 1;
        }
        return false;
    }
}
