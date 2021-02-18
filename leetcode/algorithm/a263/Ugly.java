package leetcode.algorithm.a263;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/4 上午10:39
 * @Description:
 */
public class Ugly {

    public boolean isUgly(int num) {

        while (num != 1 && num != 2 && num != 3 && num != 5) {

            if (num % 2 == 0) {
                num /= 2;
            }
            else if (num % 3 == 0) {
                num /= 3;
            }
            else if (num % 5 == 0) {
                num /= 5;
            }
            else {
                return false;
            }
        }

        return true;
    }
}
