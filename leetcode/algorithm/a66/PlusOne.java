package leetcode.algorithm.a66;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/22 下午1:11
 * @Description:
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        int[] newDigits = new int[digits.length+1];
        for(int i = digits.length-1; i>=0; i--){
            if (digits[i] != 9) {
                digits[i] += 1;
                return digits;
            }
            else {
                digits[i] = 0;
                newDigits[i+ 1] = digits[i];
                if (i == 0) {
                    newDigits[i] = 1;
                }
            }
        }
        return newDigits;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        System.out.println(Arrays.toString(plusOne.plusOne(new int[]{0})));
    }
}
