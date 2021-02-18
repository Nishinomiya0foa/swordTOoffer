package leetcode.algorithm.a167;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/27 上午11:06
 * @Description:
 */
public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> targetMap = new HashMap<>();
        for (int i=0; i<numbers.length; i ++) {
            if (targetMap.containsKey(numbers[i])){
                return new int[]{targetMap.get(numbers[i]),i+1};
            }
            targetMap.put(target-numbers[i]+1, i+1);

        }
        return new int[]{};

    }
}
