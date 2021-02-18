package sword2offer.recursion;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/8 上午9:13
 * @Description:
 */
public class CountNums {

    /**
     * 递归实现求1+2+...+n
     * @param n
     * @return
     */
    public int countNums(int n) {
        int x = n-1;
        if (n > 0) {
            n+=countNums(x);
        }
        return n;
    }

    /**
     * 递归实现求n!
     * @param n
     */
    public int countCheng(int n) {
//        int x = n - 1;
//        if (x > 0) {
//            n*=countCheng(x);
//        }
//        return n;

        return n>1?n*=countCheng(n-1):n;
    }

    /**
     * 斐波那鍥的递归解法
     * 效率低 1.递归调用函数,内存中频繁的方法压栈出栈等 2.重复的计算
     * @param n
     */
    public int getFibonacci(int n) {
        if (n==1) {
            return 0;
        }
        else if (n == 2) {
            return 1;
        }
        return getFibonacci(n-2) + getFibonacci(n-1);
    }

    /**
     * 斐波那鍥的解法2
     * 不递归, 使用循环
     * @param n
     */
    public int getFibonacci2(int n) {
        int first = 0;
        int second = 1;
        if (n <= 2) {
            return n-1;
        }
        int third = 0;
        for (int i = 0; i < n-2; i++) {
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }

    /**
     * 一次前进1或2格, 求n格前进的解法
     * 实质上也就是斐波那鍥
     * @param n
     * @return
     * n=1  1种, n=2, 两种
     */
    public int getStairs(int n) {
        if (n <= 2) {
            return n;
        }
        return getStairs(n-1) + getStairs(n-2);
    }

    public static void main(String[] args) {
        CountNums countNums = new CountNums();
        System.out.println(countNums.countNums(100));
        System.out.println(countNums.countCheng(5));
        System.out.println(countNums.getFibonacci(7));
        System.out.println(countNums.getFibonacci2(7));
        System.out.println(countNums.getStairs(4));
    }
}
