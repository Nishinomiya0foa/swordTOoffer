package leetcode.algorithm.a269;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/4 上午10:55
 * @Description:
 */
public class MissingNumber {

    public int findMissingNumber (int[] nums) {

        int count = 0;
        for (int n : nums) {
            count += n;
        }
        return (nums.length + 1) * nums.length / 2 - count;


    }
}
