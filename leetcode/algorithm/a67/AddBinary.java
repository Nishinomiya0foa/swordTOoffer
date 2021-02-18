package leetcode.algorithm.a67;

import java.util.Map;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/22 下午2:02
 * @Description: 二进制求和
 */
public class AddBinary {

    // TODO
    public String addBinary(String a, String b) {

        int aTen = binary2Ten(a);
        int bTen = binary2Ten(b);
        double r = aTen + bTen;
        System.out.println(r);
        int delta = 1, lastSqrt = 0;
        StringBuilder s= new StringBuilder();

        if ((int) r == 0) {
            return "0";
        }

        while (true) {
            double rSqrt = Math.log(r) / Math.log(2);
            double rPow = Math.pow(2, (int)rSqrt);
            rSqrt = (int)rSqrt + 1;
            r -= rPow;
            System.out.println(rSqrt+ "   " + r);
            if (lastSqrt - (int)rSqrt > 1) {
                for (int i = 0; i< lastSqrt - (int)rSqrt-1; i++){
                    s.append("0");
                }
            }
            s.append("1");
            lastSqrt = (int)rSqrt;
            if ((int) r == 0) {
                if ((int)rSqrt - (int)r > 1) {
                    for (int i = 0; i< (int)rSqrt - (int)r-1; i++){
                        s.append("0");
                    }
                }
                return String.valueOf(s);
            }
        }

    }

    private int binary2Ten(String binaryNum) {
        int sum = 0;
        for (int i = binaryNum.length() - 1; i >=0; i --) {
            if (binaryNum.charAt(i) == '1') {
                sum += Math.pow(2, binaryNum.length() -i-1);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinary("11011", "11011"));

        //  8 4 2 1
    }
}
