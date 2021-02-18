package sword2offer.dynamicandgreedy;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/8 下午4:24
 * @Description:
 * 贪婪算法
 */
public class Greedy {

    /**
     * 贪婪 剪绳子
     * @return
     * 思路: 核心在于知道并证明剪出尽量多的3
     * 证明: n>=5时, 有2(n-2)>n 3(n-3)>n,
     */
    public int cutRope2(int n) {
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }

        int timesOfThree = n/3;
        // 最后剩下4的情况, 1*3<2*2, 所以需要划分成2*2
        if (n - timesOfThree*3 == 1) {
            timesOfThree -= 1;
        }
        int timesOfTwo = (n - timesOfThree*3) / 2;
        return (int)Math.pow(3, timesOfThree) * (int)Math.pow(2, timesOfTwo);
    }

    public static void main(String[] args) {
        Greedy greedy = new Greedy();
        System.out.println(greedy.cutRope2(9));
    }
}
