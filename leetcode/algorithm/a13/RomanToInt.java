package leetcode.algorithm.a13;

import java.io.CharArrayReader;
import java.util.*;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/19 下午5:14
 * @Description:
 * https://leetcode-cn.com/problems/roman-to-integer/
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，
 * 所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 * I可以放在V(5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 */
public class RomanToInt {

    public int romanToInt(String s) {
        // 效率不高, 但可读性高, 省去各种情况的判断
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        Map<String, List<String>> keyMap = new HashMap<>();
        keyMap.put("I", Arrays.asList("VX".split("")));
        keyMap.put("X", Arrays.asList("LC".split("")));
        keyMap.put("C", Arrays.asList("DM".split("")));

        List<String> l = Arrays.asList(s.split(""));
        System.out.println(l);
        String last = "E";
        int sum = 0;
        for (int i=l.size()-1; i>=0; i--) {
            String word = l.get(i);
            if (keyMap.containsKey(word) && keyMap.get(word).contains(last)) {
                sum -= map.get(last);
                sum += map.get(last) - map.get(word);
            }
            else {
                sum += map.get(word);
            }
            last = word;
        }
        return sum;

    }

    public static void main(String[] args) {
        RomanToInt romanToInt = new RomanToInt();
        System.out.println(romanToInt.romanToInt("V"));
    }
}
