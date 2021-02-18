package leetcode.algorithm.a14;

import sun.java2d.pipe.AATextRenderer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/20 上午10:21
 * @Description:
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * https://leetcode-cn.com/problems/longest-common-prefix/
 */
public class LongestPrefix {

    // TODO 未完成
    public String longestPrefix(String[] strs) {


        // 最后一个作为数组
        String r = strs[strs.length-1];
        List<String> l = new ArrayList<>(200);
        System.out.println(l);
        l = Arrays.asList(r.split(""));
        System.out.println(l);
        l.add("z");
        System.out.println(l);



        for (int i =0; i< strs.length-1; i ++) {
            for (int j = 0; j < strs[i].toCharArray().length; j++) {
                if (!l.contains(String.valueOf(strs[i]))) {
                    for (int k=j; k<l.size(); k++) {
                        l.add(k, "");
                        break;

                    }
                }
            }
        }
        System.out.println(l);
        return "";
    }

    public static void main(String[] args) {
        String[] strs = {"zxcv", "asdfgh"};
        LongestPrefix longestPrefix = new LongestPrefix();
        longestPrefix.longestPrefix(strs);
    }
}
