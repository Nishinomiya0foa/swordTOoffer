package leetcode.algorithm.a21;

import java.util.List;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/20 下午1:51
 * @Description:
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */

public class ListNode {
    int val;
    ListNode next;
    ListNode() {};
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        return new ListNode();
    }

    @Override
    public String toString() {
        return this.val + " -> " + this.next;
    }

    public static void main(String[] args) {
        ListNode n5 =  new ListNode(5);
        ListNode n3 =  new ListNode(3, n5);
        ListNode n1 =  new ListNode(1, n3);
        System.out.println(n1);

        ListNode j6 = new ListNode(6);
        ListNode j4 = new ListNode(4, j6);
        ListNode j2 = new ListNode(2, j4);
        System.out.println(j2);

        ListNode listNode = new ListNode();
        System.out.println(listNode.mergeTwoLists(n1, j2));
    }
}

