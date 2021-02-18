package leetcode.algorithm.a202;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/2 下午3:09
 * @Description:
 */
public class HappyNum {

    public boolean isHappy(int n ) {

        Set<Integer> seen = new HashSet<>();
        while (n!= 1 && !seen.contains(n)){
            seen.add(n);
            n = this.getNext(n);

        }
        return n == 1;
    }

    private int getNext(int n ) {
        int sum = 0;
        while (n>0) {
            int last = n % 10;
            n /= 10;
            sum += last*last;
        }
        return sum;
    }


    public static void main(String[] args) {
        HappyNum happyNum = new HappyNum();
        System.out.println(happyNum.isHappy(199));
    }
}
