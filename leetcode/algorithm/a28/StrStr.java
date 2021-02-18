package leetcode.algorithm.a28;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/21 上午9:34
 * @Description:
 *
 * 实现strStr()函数。
 *
 * 给定一个haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回 -1。
 *
 * https://leetcode-cn.com/problems/implement-strstr/
 */
public class StrStr {

    public int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        if (haystack.contains(needle)) {
            List<String> l = Arrays.asList(haystack.split(needle));
            System.out.println(l);
            return l.isEmpty()? 0:l.get(0).length();
        }
        return -1;
    }

    public static void main(String[] args) {
        StrStr strStr = new StrStr();
        System.out.println(strStr.strStr("aaa", "aaa1"));
        System.out.println(Arrays.asList("a".split("")).get(0).length());
        System.out.println("a".contains(""));
    }
}
