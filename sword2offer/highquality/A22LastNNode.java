package sword2offer.highquality;

import leetcode.algorithm.a21.ListNode;
import sword2offer.self.LinkList;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/18 下午3:34
 * @Description:
 *
 * 双指针法, Java中没有指针的概念, 但这个思想可以有
 * 一次遍历, 使用两个指针, 其中一个快一点,另一个慢一点, 快慢不一致, 可以达成目标
 *
 *  只遍历一次, 找到链表的倒数第n个节点的值, 健壮性
 *
 *  双指针 遍历两次
 *  或者可以遍历时将其添加到列表, 占用0(n) 的额外空间, 时间O(n)
 */
public class A22LastNNode {

    public int findLastNNode(LinkList nodeList, int n) throws Exception {
        if (n <= 0 || nodeList == null) {
            throw new Exception();
        }

        int i = 0;
        int res = 0;
        LinkList firstNode = nodeList;
        LinkList targetNode = nodeList;
        while (firstNode != null) {
            if (i >= n-1) {
                res = targetNode.getVal();
                targetNode = targetNode.getNext();
            }
            i ++;
            firstNode = firstNode.getNext();

        }
        System.out.println(i+ "   "+ (n));
        if (n>i) {
            throw  new Exception();
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        A22LastNNode lastNNode = new A22LastNNode();
        LinkList node4 = new LinkList(4);
        LinkList node3 = new LinkList(3, node4);
        LinkList node2 = new LinkList(2, node3);
        LinkList node1 = new LinkList(1, node2);
        System.out.println(lastNNode.findLastNNode(node1, 1));
    }
}
