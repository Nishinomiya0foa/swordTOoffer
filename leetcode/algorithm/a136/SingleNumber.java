package leetcode.algorithm.a136;

import java.util.Arrays;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/27 上午10:08
 * @Description:
 */
public class SingleNumber {


    // TODO 亦或
    // 任何数与0的亦或结果是其本身
    // 任何数和自身亦或, 结果时0
    // 亦或运算满足交换率和结合率
    // 综上, 数组的全部数字 的亦或总和,  就是题目要求的结果,  这种解法绝了, 真骚
    public int singleNumber(int[] nums) {



        for (int n: nums ) {

        }
        nums = Arrays.stream(nums).sorted().toArray();

        return 0;
    }
}
