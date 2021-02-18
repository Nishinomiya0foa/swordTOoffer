package leetcode.algorithm.a172;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/27 下午5:08
 * @Description:
 */
public class TrailingZeroes {

    public int trailingZeroes(int n) {

        long sum = 1L;
        int count = 0;
        for (int i = 1; i<= n ; i ++) {
            // 2 5    10
            if (i % 5 == 0) {
                count += 1;
            }
            sum *= i;
        }
        System.out.println(count);
        System.out.println(sum);
        return count;
    }

    // 2*3*4*5*6*
    // 2 5 10 15 20 25 30
    public static void main(String[] args) {
        TrailingZeroes trailingZeroes = new TrailingZeroes();
//        trailingZeroes.trailingZeroes(30);
//        trailingZeroes.trailingZeroes(20);
        trailingZeroes.trailingZeroes(15);
    }
}
