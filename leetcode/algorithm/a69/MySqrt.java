package leetcode.algorithm.a69;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/25 上午9:16
 * @Description:
 */
public class MySqrt {

    // 自己实现求x的平方根  二分查找法
    // 效率很低 时间复杂度 log x
    public int mySqrt(int x) {

        int tmp = x/16;
        int lastNum = 0;
        while (true) {
            if (tmp*tmp <= x && (tmp+1)*(tmp+1) > x) {
                return tmp;
            }
            else if (tmp*tmp < x){
                tmp = (tmp + lastNum) / 2;
            }
            else {
                lastNum = tmp;
                tmp = tmp / 2;
            }
        }
    }

    public static void main(String[] args) {
        MySqrt mySqrt = new MySqrt();
        System.out.println(mySqrt.mySqrt(49));
    }
}
