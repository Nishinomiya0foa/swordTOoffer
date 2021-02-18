package sword2offer.highquality;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/9 下午4:07
 * @Description:
 * TODO
 */
public class A17CountNums {

    /**
     * 打印从1到最大的n位数, 例如:n=3时,打印1,2,3...999;
     * 问题1: 大数的问题
     * @param n
     * @return
     */
    public String printNums(int n) {
        // 在数字前面补0, n位所有是禁止其实就是n个从0到9的全排列
        // 把数字的每一位都从0到9排列一遍, 排在前面的0不打印
        char[] number = new char[n+1];
        number[n] = '\0';
        for (int i = 0; i<10; i++) {
            number[0] = (char) ((char) i+ '0');
        }
        return ";";
    }

    private void printNumsSon(char[] number, int length, int index) {
        if (index == length -1) {

        }
    }
}
