package sword2offer.self;

import java.util.Arrays;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/7 上午9:58
 * @Description:
 * 找数组中的重复数字,数组全数字,1-n,长度n-1
 * 时间O(n)  怎么证明
 * 空间O(1)
 *
 * 或者使用哈希表
 * 时间O(n)
 * 空间0(n)
 */
public class RepeatNumber {

    public int FindRepeatNumber(int[] nums) {

        int tmp;
        for (int i = 0; i < nums.length; i++) {
            while (i != nums[i]) {
                System.out.println(nums[i] + "    "+ nums[nums[i]]);
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                tmp = nums[i];
                nums[i] = nums[tmp];
                nums[tmp] = tmp;
            }
        }

        return 0;
    }

    /**
     *
     * @param nums
     * @return
     * 二分法, 查找x的坐标
     * 核心就是超找到二分的位置,更改边界值的时机
     */
    public int FindRepeatNumber2(int[] nums, int x) {
        // >> 数字每右移一位相当于/2, 左移相当于*2
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (nums[mid] != x) {
            mid = ((end-start) / 2) + start;
            if(nums[mid] < x) {  // 目标值在右半部分
                start = mid + 1;
            }
            else {  // 在左半部分
                end = mid;
            }
            System.out.println(mid);
        }
        return mid;
    }

    /**
     * 找到nums中存在的重复数字, nums  1-n
     * @param nums
     * @return
     */
    public int FindRepeatNumber3(int[] nums) {
        int start = 1;
        int end = nums.length - 1;
        while (end >= start) {
            int mid = (end - start) / 2 + start;
            int timesLeft = this.FindRangeTimes(nums, start, mid);
            int timesRight = this.FindRangeTimes(nums, mid+1, end);
            if (mid == start || mid == end) {
                if (timesLeft != mid-start+1 || timesRight != end - mid) {
                    return timesRight != end-mid?end:start;
                }
            }
            if (mid-start+1 < timesLeft) {
                end = mid;
            }
            else {
                start = mid+1;
            }

        }

        return 0;
    }

    private int FindRangeTimes(int[] nums, int start, int end) {
        int count = 0;
        for (int n: nums) {
            if (start <= n && n <= end) {
                count ++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        RepeatNumber repeatNumber = new RepeatNumber();
//        System.out.println(repeatNumber.FindRepeatNumber(new int[]{4,3,1,4,1}));
//        System.out.println(repeatNumber.FindRepeatNumber2(new int[]{1,2,4,6,7,8,90,100,122}, 122));
        System.out.println(repeatNumber.FindRepeatNumber3(new int[]{2,3,4,4,1}));
    }
}
