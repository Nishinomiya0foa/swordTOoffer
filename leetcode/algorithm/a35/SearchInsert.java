package leetcode.algorithm.a35;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/21 上午10:16
 * @Description:
 */
public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] >= target) {
                return i;
            }
            if (i+1 >= nums.length) {
                return nums.length;
            }
            if (nums[i] < target && nums[i+1] >= target) {
                return  i + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        SearchInsert searchInsert = new SearchInsert();
        System.out.println(searchInsert.searchInsert(new int[]{1}, 0));
    }
}
