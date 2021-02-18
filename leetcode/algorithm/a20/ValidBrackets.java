package leetcode.algorithm.a20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/20 上午11:29
 * @Description:
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * https://leetcode-cn.com/problems/valid-parentheses/
 */
public class ValidBrackets {

    // 压栈 从左网友, 左括号压栈, 右括号出栈
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<Character, Character>() {
            {
                put(')', '(');
                put(']', '[');
                put('}', '{');
            }
        };
        Stack<Character> validS = new Stack<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (validS.empty()) {
                    return false;
                }
                else {
                    char need = validS.pop();
                    if (map.get(c) != need){
                        return false;
                    }
                }
            }
            else {
                validS.add(c);
            }
        }
        return validS.empty();
    }


    public static void main(String[] args) {
        ValidBrackets validBrackets = new ValidBrackets();
        System.out.println(validBrackets.isValid("()[][]{()}"));
    }
}
