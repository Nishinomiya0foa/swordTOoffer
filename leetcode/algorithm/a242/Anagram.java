package leetcode.algorithm.a242;

import java.util.*;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/4 上午9:25
 * @Description:
 */
public class Anagram {

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;  // 记当前有几个不为0的
//        for (char c: s.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0)+1);
//        }
//        for (char c: t.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) - 1);
//            if (map.get(c) < 0) {
//                return false;
//            }
//        }
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
            count += map.get(s.charAt(i)) + map.get(t.charAt(i));
            if (map.get(s.charAt(i)) != 0) {
                count += 1;
            }
        }
//        {a:1, b:-1;  a:0, b:0}
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character k = entry.getKey();
            if (map.get(k) != 0) {
                return false;
            }
        }
        System.out.println(map.values());;
        for (int i : map.values()) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        anagram.isAnagram("abc", "cba");

    }
}
