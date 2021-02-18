package sword2offer.highquality;

import sword2offer.self.LinkList;
import sword2offer.self.LinkList6;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/18 下午4:20
 * @Description:
 *
 * 一个链表中可能有环, 如果有, 找出这个环的入口节点
 */
public class A23CircleNode {

    public LinkList findCircleEnter(LinkList linkNode) throws Exception {
        LinkList quickNode = linkNode;
        LinkList slowNode = linkNode;
        int circleCount = 0;
        boolean secondRound = false;  // 快慢节点相遇说明是包含环的, 用该变量表明相遇之后开启第二次循环, 再次相遇时, 慢节点走的次数就是环的数量
        while (true) {
            if (quickNode.getNext() != null && slowNode.getNext() != null) {
                quickNode = quickNode.getNext();
                slowNode = slowNode.getNext();
                if (quickNode.getNext() != null) {
                    quickNode = quickNode.getNext();
                }
                else {
                    throw new Exception();
                }
                if (secondRound) {
                    circleCount ++;
                }
            }
            else {
                throw new Exception();
            }
            if (slowNode == quickNode) { // 两个节点相遇
                if (secondRound) {
                    break;
                }
                secondRound = true;
            }
        }
        quickNode = linkNode;
        slowNode = linkNode;
        for (int i = 0; i < circleCount; i++) {
            quickNode = quickNode.getNext();
        }
        System.out.println(quickNode.getVal() + "  " + slowNode.getVal());
        while (true) {
            if (quickNode != slowNode) {
                quickNode = quickNode.getNext();
                slowNode = slowNode.getNext();
            }
            else {
                break;
            }
        }
        return slowNode;
    }

    public static void main(String[] args) throws Exception {

        LinkList node6 = new LinkList(6);

        LinkList node5 = new LinkList(5, node6);
        LinkList node4 = new LinkList(4, node5);
        LinkList node3 = new LinkList(3, node4);
        LinkList node2 = new LinkList(2, node3);
        LinkList node1 = new LinkList(1, node2);
        node6.setNext(node5);
        A23CircleNode circleNode = new A23CircleNode();
        System.out.println(circleNode.findCircleEnter(node1).getVal());
    }
}
