package sword2offer.self.stackANDqueue;

import java.util.Stack;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/7 下午4:47
 * @Description:
 * 两个栈实现队列
 */
public class BuildQueueByStack {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> stackTmp = new Stack<>();

    public void push(int n) {
        this.stack.add(n);
        this.stackTmp.clear();
    }

    public int pop() {
        System.out.println(String.valueOf(stackTmp));
        if (this.stackTmp.isEmpty()) {  // 不行, 每次stack1都需要是最新的数据, 这样需要stack2 pop添加进去, stack2永远是空的了
            while (!this.stack.isEmpty()) {
                this.stackTmp.add(this.stack.pop());
            }
        }
        int r = this.stackTmp.pop();
        this.stack.clear();
        while (!this.stackTmp.isEmpty()) {
            this.stack.add(this.stackTmp.pop());
        }
        return r;
    }

    public String printQueue() {
        return String.valueOf(stack);
    }

    public static void main(String[] args) {
        BuildQueueByStack queue = new BuildQueueByStack();
        queue.push(2);
        queue.push(5);
        queue.push(7);
        System.out.println(queue.printQueue());
        queue.pop();
        System.out.println(queue.printQueue());
        queue.pop();
        System.out.println(queue.printQueue());
    }
}
