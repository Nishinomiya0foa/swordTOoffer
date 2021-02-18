package leetcode.algorithm.a125;

import java.util.Arrays;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/26 下午5:23
 * @Description:
 */
public class IsPalindrome {

    public boolean isPalindrome(String s) {

        StringBuilder newS = new StringBuilder();
//        char[] cs = new char[5];
        for (char c : s.toCharArray()) {
            if (65 <= c && 122 >= c) {
                newS.append(c);
            }
        }
        int size = newS.length();
        if ((size & 1)== 1) {
            System.out.println("计数");
        }

        for (int i = size-1; i > size / 2; i--) {
            if (s.toCharArray()[i] != 3){

            }
        }
        System.out.println(newS);

        return true;

    }

    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        isPalindrome.isPalindrome("  123xczdreer2nkn;  ");
    }
}
