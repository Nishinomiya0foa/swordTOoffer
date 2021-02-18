package leetcode.algorithm.a225;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/3 上午10:29
 * @Description:
 */
public class MyStack {

    private Queue<Integer> queue;
    private Queue<Integer> otherQueue;

    public MyStack(){
        this.queue = new ArrayDeque<>();
        this.otherQueue = new ArrayDeque<>();

    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop(){

        while (!this.queue.isEmpty()) {
            int first = this.queue.remove();
            if (!this.queue.isEmpty()) {
                this.otherQueue.add(first);
            }
            else {
                this.queue = this.otherQueue;
                return first;
            }
        }
        return 0;
    }

    public int top() {

        while (!this.queue.isEmpty()) {
            int first = this.queue.remove();
            this.otherQueue.add(first);
            if (this.queue.isEmpty()) {
                this.queue = this.otherQueue;
                return first;
            }
        }
        return 0;
    }

    public boolean empty() {
        return this.queue.isEmpty();
    }
}
