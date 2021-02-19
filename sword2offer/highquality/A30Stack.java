package sword2offer.highquality;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/19 下午2:39
 * @Description:
 * 实现栈, 够能得到栈最小元素的min函数, min push pop的时间复杂度O(1)
 * 简单题, 对大脑进行一个按摩
 */
// 为了使得min函数时间复杂度O(1), 我们栈里面存的数不是数字, 而是记录当前情况的数组[当前数, 当前最小数]
public class A30Stack {
    Stack<List<Integer>> stack = new Stack<>();

    List<Integer> l = new ArrayList<>();
    public A30Stack() {
    }

    public void push(int num) throws Exception {
        int minNum = this.stack.isEmpty()?num: Math.min(this.min(), num);  //
        this.stack.add(new ArrayList<Integer>(){{
            add(num);
            add(minNum); }});
    }

    public int pop() {
        if (!this.stack.isEmpty()) {

        }
        return 0;
    }

    public int min() throws Exception {
        int minNum = 0;
        if (!this.stack.isEmpty()) {
            List<Integer> top = this.stack.get(this.stack.size() - 1);
            minNum = top.get(1);
        }
        else {
            throw new Exception();
        }
        return minNum;
    }

    public static void main(String[] args) throws Exception {
        A30Stack newStack = new A30Stack();
        newStack.push(3);
        newStack.push(2);
        newStack.push(5);
        newStack.push(1);
        System.out.println(newStack.min());
    }
}
