package leetcode.algorithm.a228;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/3 上午11:20
 * @Description:
 */
public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) {
            return list;
        }
        int start = nums[0];
        int end = nums[0];
        for (int i = 0; i < nums.length; i++) {
            boolean case1 = i == nums.length-1;
            long a = nums[i] + 1L;
            System.out.println(a + "    "+ nums[i]);
            if (case1 || nums[i+1] - (long)nums[i] > 1L){
                if (start != end) {
                    list.add(start + "->" + end);
                }
                else {
                    list.add(start + "");
                }
                if (case1) {
                    return list;
                }
                start = nums[i+1];
            }
            end = nums[i+1];
        }
        return list;
    }

    public static void main(String[] args) {
        SummaryRanges summaryRanges = new SummaryRanges();
//        System.out.println(summaryRanges.summaryRanges(new int[] {0,2,3,5,7,8, 10, 22,23,24,25}));
        System.out.println(summaryRanges.summaryRanges(new int[] {-2147483648,-2147483647,2147483647}));
    }
}
