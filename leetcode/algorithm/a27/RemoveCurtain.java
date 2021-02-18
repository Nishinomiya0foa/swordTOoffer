package leetcode.algorithm.a27;

import java.util.Arrays;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/20 下午4:43
 * @Description:
 * 给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * https://leetcode-cn.com/problems/remove-element/
 */
public class RemoveCurtain {

    // TODO 列表出来了, int搞不定, 明天弄 2020/1/20  flag
    public int removeElement(int[] nums, int val) {
        int index = nums.length -1;
        for (int i = 0; i < nums.length; i ++) {
            while (index >=0 && nums[index] == val) {
                index -= 1;
            }
            System.out.println(i + "    " + index + "    ");
            if (index < 0) {
                return 0;
            }
            if (nums[i] == val) {
                nums[i] = nums[index];
                index -= 1;

            }
            if (i > index) {
                System.out.println(Arrays.toString(nums));
                return i;
            }
            else if (i == index) {
                System.out.println(Arrays.toString(nums));
                return i + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        RemoveCurtain removeCurtain = new RemoveCurtain();
        System.out.println(removeCurtain.removeElement(new int[]{3,3,3,3, 1}, 3));  // 2
    }
}
