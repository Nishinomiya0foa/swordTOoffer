package leetcode.algorithm.a7;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/19 下午3:11
 * @Description:
 * https://leetcode-cn.com/problems/reverse-integer/
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转
 * -2^31 <= x <= 2^31 - 1
 *
 *
 */
public class RevertNum {

    public int reverse(int x) {
        long num = 0L;  // long型容纳int溢
        boolean isNegative = x < 0;
        int c = 0;
        c = Math.abs(x);
        while (c > 9) {
            int last = c % 10;
            num = num * 10 + last;
            c /= 10;
        }
        num = num * 10 + c;
        long r = isNegative?-num:num;
        return (int) r == r? (int)r: 0; // 判断是否溢出
    }

    public static void main(String[] args) {
        RevertNum revertNum = new RevertNum();
        System.out.println(revertNum.reverse(1534236469));
        System.out.println(revertNum.reverse(123));
        System.out.println(1056389759);
        System.out.println(1534236469);
    }
}
