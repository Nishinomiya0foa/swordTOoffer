package leetcode.algorithm.a168;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/27 上午11:20
 * @Description:
 */
public class ConvertToTitle {

    // 10进制转26进制
    public String convertToTitle(int n) {
        int u;
        StringBuilder s= new StringBuilder();
        while (n > 26) {
            u = Math.min(n / 26, 26);
            n -= u*26;
            if (n == 0) {
                n = 26;
                u -=1;
            }
            s.append(Character.toChars((int)u+64));

        }
        s.append(Character.toChars(n+64));
        return String.valueOf(s);
    }

    public static void main(String[] args) {
        ConvertToTitle convertToTitle = new ConvertToTitle();
        System.out.println(convertToTitle.convertToTitle(52));
    }
}
