package leetcode.algorithm.a219;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/3 上午9:29
 * @Description:
 */
public class NearByDuplicate {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {  // 只有找到了距离<=k的才返回, 否则将当前的 数字:距离插入
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
