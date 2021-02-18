package leetcode.algorithm.a53;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/21 下午2:29
 * @Description:
 *
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * https://leetcode-cn.com/problems/maximum-subarray/
 */
public class MaxSubArray {

    // TODO 第一个一定是正数,  后面每遇到一个负数, 就判断和负数之前的连续正数的和 > 0?
    // TODO 未完成
    public int maxSubArray(int[] nums) {
        // 第一段连续正数的和 加 接下来一段连续负数, >= 0  认为前一段是连续正数
        //                                     < 0   取接下来的一段连续正数
        int count = 0;
        int nagCount = 0;
        int flag = 0;
        for (int n : nums) {
//            if (n == 0) {
//                continue;
//            }
            if (flag <= 0) {
                flag = 0;
                flag += n;
                continue;
            }
            System.out.println(flag);
            if (n < 0) {
                nagCount += n;
            }
            else {
                count += n;
            }
        }



        return 0;

    }

    public static void main(String[] args) {
        MaxSubArray maxSubArray = new MaxSubArray();
//        System.out.println(maxSubArray.maxSubArray(new int[] {-2, 1, -3, 4 ,-1 ,2 ,1 ,-5 ,4}));
//        System.out.println(maxSubArray.maxSubArray(new int[] {-2, 1, -3, 4 , 1, -1, -1, 3}));
        System.out.println(maxSubArray.maxSubArray(new int[] {-2, -2, 1, -1}));
    }
}


//[-2, 1, -3, 4 ,-1 ,2 ,1 ,-5 ,4]


//[  -1, -2, 1, 3, 1, 3, -4 ,-1]

// [1]     [4]      [3]     [4]
//[   1,      4,    2, 1,    4]
//[-2,    -3,    -1,      -5]

// [-2, 1, -3, 4, -1, 3, -5 , 4]




// 2, -2,  6,
