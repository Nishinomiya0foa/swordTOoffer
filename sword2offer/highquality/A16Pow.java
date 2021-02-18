package sword2offer.highquality;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/9 下午2:46
 * @Description:
 */
public class A16Pow {

    /**
     * 求n的x次方, 不考虑大数
     * @param n
     * @param x
     * @return
     */
    boolean fullFlag = true;  // 全局变量, 标识输入异常
    public double realizePow(double n, int x) throws IllegalAccessException {
//        // 需考虑x为0或负数的情况
//        fullFlag = true;
//        if (x == 0) {
//            return 1.0;  // 这里认为0的0次方也是1;
//        }
//        if ((long)n == 0.0) {  // 转换成long再比较, 避免浮点数精度问题导致的错误
//            if (x<0) {
////                fullFlag = false;
////                return 0.0;
//                throw new IllegalAccessException("xxx");  // 可以主动抛出异常, 也可以采用全局变量标识
//            }
//            return 0.0;
//        }
//        boolean flag = x > 0;
//        double r = n;
//        for (int i = 1; i < Math.abs(x); i++) {
//            r*=n;
//        }
//        return flag?r: 1/r;  // n的负数次方, 等于1/n的x次方

        // 方法二: n为偶数时  a的n次方= a的n/2次方*a的n/2次方;
        //        n为奇数时  a的n次方 = a的(n-1)/2次方*a的(n-1)/2次方*n
        // 由此 可以使用递归的思想, /2 等于右移1
        if (x < 0 && (long)n == 0) {  // 没有0的负x次方定义, 可以抛出异常之类的处理;
            return 3.521;
        }
        if (x == 0) {
            return 1.0;
        }
        if (x == 1) {
            return n;
        }
        if (x == -1) {
            return 1/n;
        }
        double r = this.realizePow(n, x>>1);
        r *= r;
        if ((x & 0x1) == 1) {
            r *= n;
        }
        return r;

    }


    public static void main(String[] args) throws IllegalAccessException {
        A16Pow a16Pow = new A16Pow();
        System.out.println(a16Pow.realizePow(0,-1));
        System.out.println(a16Pow.fullFlag);
    }
}
