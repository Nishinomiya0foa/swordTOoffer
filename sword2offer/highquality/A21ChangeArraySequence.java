package sword2offer.highquality;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.function.Function;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/18 下午2:24
 * @Description:
 * 调整数组顺序使奇数位于偶数前面
 */
public class A21ChangeArraySequence {

    // 双指针遍历 交换奇偶
    public int[] changeSequence(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int j = nums.length - 1;
        int i = 0;
        while (i < j) {
            while (i < j && (nums[j] &1) == 0) {
                j--;
            }
            while (i<j && (nums[i] & 1)==1) {  // 如果改变了规则, 这里的判断条件可以抽象成一个函数, 解藕
                i++;
            }
            if (i < j) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        return nums;
    }

    // 如果不是要按奇偶分, 而是按正负? 能否被3整除....
    // 把判断条件抽象, 完成解藕
    // TODO 函数作为参数的传参
    public int[] changeSequence2(int[] nums, Method func) throws Exception {

        if (nums.length == 0) {
            return nums;
        }
        int j = nums.length - 1;
        int i = 0;
        while (i < j) {
            System.out.println(func.invoke(func.getClass().newInstance(), nums[j]));
            while (i < j && (boolean)func.invoke(func.getClass(), nums[j])) {
                j--;
            }
            while (i<j && (boolean)func.invoke(nums[i])) {
                i++;
            }
            if (i < j) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        return nums;
    }

    public boolean isEven(int num) {
        return (num & 1) == 0;
    }

    public static void main(String[] args) throws Exception {
        A21ChangeArraySequence changeArraySequence = new A21ChangeArraySequence();
        System.out.println(Arrays.toString(changeArraySequence.changeSequence(new int[]{1, 2, 3, 4, 5,12})));
        System.out.println(Arrays.toString(changeArraySequence.changeSequence2(new int[]{1, 2, 3, 4, 5,12},
                changeArraySequence.getClass().getMethod("isEven", int.class))));
    }
}
