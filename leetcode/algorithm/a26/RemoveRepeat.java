package leetcode.algorithm.a26;

import java.util.Arrays;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/20 下午3:57
 * @Description:
 *
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * https://leetcode-cn.com/problems/remove-element/
 */
public class RemoveRepeat {

    public int removeRepeat(int[] nums) {
        int latestIndex = 0;
        for (int i = 1; i < nums.length; i ++) {
            if (nums[i] != nums[latestIndex]) {
                nums[latestIndex + 1] = nums[i];
                latestIndex += 1;
            }
        }
        System.out.println(Arrays.toString(nums));
        return latestIndex + 1;

    }

    public static void main(String[] args) {
        RemoveRepeat removeRepeat = new RemoveRepeat();
        int[] nums = {1};
        System.out.println(removeRepeat.removeRepeat(nums));
    }
}
