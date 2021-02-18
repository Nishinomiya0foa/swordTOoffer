package sword2offer.self.stackANDqueue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/7 下午5:19
 * @Description:
 *
 * 用两个队列来构造栈
 * 我怎么不会用两个队列, 一个貌似就可以了
 */
public class BuildStackByQueue {

    private Queue<Integer> queue = new ArrayDeque<>();

    public void push(int n) {
        this.queue.add(n);
    }

    public int pop() {
        int size = this.queue.size(), r = 0;
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                this.queue.add(this.queue.poll());
            }
            else {
                r = this.queue.poll();
            }
        }
        return r;  // 没有考虑pop的次数>栈的size
    }

    public String printStack() {
        return String.valueOf(this.queue);
    }

    public static void main(String[] args) {
        BuildStackByQueue stack = new BuildStackByQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        stack.push(5);
        System.out.println(stack.printStack());
    }
}