package leetcode.algorithm.a58;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/22 上午10:47
 * @Description:
 */
public class LastWordLength {

    public int lengthOfLastWord(String s) {

        List<String> l = Arrays.asList(s.split(" "));
        return l.size() == 0? 0:l.get(l.size()-1).length();
    }

    public static void main(String[] args) {
        LastWordLength lastWordLength = new LastWordLength();
        System.out.println(lastWordLength.lengthOfLastWord(" "));
    }
}
