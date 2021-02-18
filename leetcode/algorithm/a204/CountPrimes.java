package leetcode.algorithm.a204;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/2 下午4:30
 * @Description:
 */
public class CountPrimes {

    public int countPrimes(int n) {
        // 小于正整数n 有多少个质数

        // 什么筛法, i如果是质数, i的x倍都不是倍数
        int count=0;
        boolean[] flag=new boolean[n];
        for(int i=2;i<n;i++){
            if(!flag[i]){
                count++;
                for(int j=i+i;j<n;j+=i)
                    flag[j]=true;
            }
        }
        return count;
    }
}
