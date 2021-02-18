package leetcode.algorithm.a205;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/2 下午4:51
 * @Description:
 */
public class Ismorphic {

    public boolean ismorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        for (int i=0; i<ss.length;i++){
            if (!map.containsKey(ss[i])){
                map.put(ss[i], tt[i]);
            }
            else{
                if (map.containsValue(tt[i])) {
                    return false;
                }
                else if (map.get(ss[i]) != tt[i]){
                    return false;
                }
            }
        }

        return true;
    }
}
