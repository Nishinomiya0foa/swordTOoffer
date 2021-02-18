package leetcode.algorithm.a9;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/19 下午4:06
 * @Description:
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 你能不将整数转为字符串来解决这个问题吗？
 * https://leetcode-cn.com/problems/palindrome-number/
 */
public class Palindrome {

    public boolean isPalindrome(int x) {
        // 将x拆成两部分  长度偶数中间拆, 长度奇数去掉中间那个
        long num = 0L;
        int c = x;
        while (c >= 0) {
            int last = c % 10;
            num = num * 10 + last;
            c /= 10;
            if (c <= num) {
                return (c == num || c == num / 10) && (x/10*10 != x || x == 0);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(1210));
    }
}
