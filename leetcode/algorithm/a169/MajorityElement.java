package leetcode.algorithm.a169;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/27 下午3:39
 * @Description:
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {

        // 投票算法
        Integer ele = null;
        int count = 0;
        for (int e: nums) {
            if (count == 0) {
                ele = e;
            }
            count += (e == ele) ? 1: -1;
        }
        return ele;
    }

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();

        System.out.println(majorityElement.majorityElement(new int[] {10, 9,9,9 ,10}));
    }
}
