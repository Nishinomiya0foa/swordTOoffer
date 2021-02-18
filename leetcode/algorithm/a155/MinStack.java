package leetcode.algorithm.a155;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/27 上午10:25
 * @Description:
 */
public class MinStack {

    private List<Integer> l;
    public MinStack(){
        this.l = new ArrayList<>();
    }

    public void push(int x) {
        this.l.add(x);
    }

    public void pop() {
        this.l.remove(this.l.size() -1);
    }

    public int top(){
        System.out.println(this.l);
        return this.l.get(this.l.size() -1);
    }

    public int getMin(){

        // TODO 辅助栈, push的时候记录当前的最小值, pop的时候也同步POP出
        // TODO 将辅助栈合并到原先的栈中, 不再存数字, 存个数组或者map, 记录当前的最小值,节省空间和push pop操作
        int min = this.top();
        List<Integer> tmp = new ArrayList<>();
        while (true) {
            try {  // 异常捕捉耗时, 改成判断是否有剩余更好
                tmp.add(this.top());
                min = Math.min(this.top(), min);

                this.pop();
            }
            catch (IndexOutOfBoundsException e) {
                for (int i = tmp.size() - 1; i >= 0; i --) {
                    this.push(tmp.get(i));
                }
                return min;
            }
        }

    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        System.out.println(minStack.getMin());
    }

}
