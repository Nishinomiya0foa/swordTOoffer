package sword2offer.findandsort;

import java.util.Random;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/8 上午10:27
 * @Description:
 */
public class SortFunc {

    /**
     * 快速排序: 选一个数, 将比它大的放右边, 比他小的放左边; 再在左右区间重复该行为, 直至每个区间都只有一个元素
     * @param nums
     * @return
     */
    public int quickSort(int[] nums) {
        Random random = new Random();
        int x = random.nextInt(nums.length);


        return 0;
    }
    private int divide(int[] nums, int start, int end) {
        Random random = new Random();
//        int x = random.nextInt(nums.length);
        int j = end;
        int base = nums[0];
        for (int i = start; i<end; i++) {
            System.out.println(i+"  ");
            j--;
            if (i != j) {

                if (nums[i] > base) {

                }
            }
        }


        return 0;
    }

    public static void main(String[] args) {
        SortFunc sortFunc = new SortFunc();
        sortFunc.divide(new int[] {}, 0, 5);
    }
}
