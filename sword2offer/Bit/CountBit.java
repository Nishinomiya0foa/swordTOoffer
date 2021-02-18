package sword2offer.Bit;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/9 下午1:28
 * @Description:
 */
public class CountBit {


    public void countBit(int x) {

        System.out.println(11&3);

    }

    /**
     * 整数n的二进制表达中有多少个1
     * 负数在计算机中存的是补码(反码+1)
     * @param n
     */
    public int countOneFromBinary(int n){
        // 方法1     思路: 检查二进制最右边是否为1, 然后右移, 注意负数的符号位情况, 负数情况会死循环
//        int x = Math.abs(n);
//        int count = 0;
//        while (x!=0) {
//            if ((x&1) == 1) {
//                count++;
//            }
//            x = x >> 1;
//        }
//        return count;

        // 方法2  思路: 分别对1 10 100... 做与运算, 就能分别得出n的最低位,次低位是否为1,
        // 时间复杂度O(n)  空间O(1)
        // 相比于方法1, 主要是不用对负数进行特殊处理的改进
        // TODO 有问题
//        int count = 0;
//        int offset = 1;
//        while (offset > 0) {
//            if ((n & offset) >= 1) {
//                count++;
//            }
//            offset = offset<<1;
//        }
//        return count;

        // 方法3 思路: 二进制中, 整数-1, 从结果上看就是把最后一个1变成0, 把再右边的0变成1; 之后再把n与运算之后的数做与运算,
        //            就相当于单纯的去掉了最右边的1, 遍历的次数, 就是1的个数,用时更少
        //            TODO 这个思路在二进制解题中很好用
        int count = 0;
        while (n != 0) {
            int tmp = n - 1;
            n &= tmp;
            count += 1;
        }
        return count;
    }

    public static void main(String[] args) {

        CountBit countBit = new CountBit();
        countBit.countBit(5);
        System.out.println(countBit.countOneFromBinary(-1));
    }
}
