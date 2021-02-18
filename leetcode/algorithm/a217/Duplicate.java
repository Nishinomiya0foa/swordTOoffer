package leetcode.algorithm.a217;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/2 下午5:51
 * @Description:
 */
public class Duplicate {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int n: nums) {
            if (!set.add(n)) {
                return false;
            }
        }
        return true;
    }
}
