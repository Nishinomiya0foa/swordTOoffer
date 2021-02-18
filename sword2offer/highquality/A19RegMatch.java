package sword2offer.highquality;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/18 上午11:33
 * @Description:
 *
 *
 */
public class A19RegMatch {
    /**
     * reg 中包含了字母 . * 点号标识任意一位字母; 星号标识前面的字母出现任意多次
     * 判断 str 是否为  reg的一种表达
     * 认为reg是合法的正则表达式
      * @param reg
     * @param str
     * @return
     */
    public boolean regMatch(String reg, String str) {
        if (reg==null || str==null) {
            return false;
        }
        int j = 0;
        for (int i = 0; i < reg.length(); i++) {
            if (reg.charAt(i) == '.') {
                j++;
            }
            else if (reg.charAt(i) == '*') {
                char curReg = reg.charAt(i-1);
                char curStr = str.charAt(j-1);
                int skip = 0;
                if (curReg != curStr) {
                    j --;
                }
                else {
                    i --;
                }
            }
            // 出现单独的字母 不一定就是不匹配 也可能后面有个*号
        }

        return false;
    }


    // 从后往前遍历reg
    public boolean regMatch2(String reg, String str) {
        if (reg == null || str == null) {
            return false;
        }

        boolean specialFlag = false;
        int j = str.length()-1;
        for (int i = reg.length() - 1; i >= 0; i--) {
            char curReg = reg.charAt(i);
            if (curReg == '*') {
                specialFlag = true;
                i--;
            }
            else {
                if (specialFlag) {  // a*
                    i++;
                    j--;
                }
                else {
                    if (curReg == str.charAt(j) || curReg == '.') {
                        j --;
                    }
                    else {
                        return false;
                    }
                }
                if (j<0) {
                    return i==0;
                }
            }
        }
        return false;
    }
}
