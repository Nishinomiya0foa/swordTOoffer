package sword2offer.linklist;

import sword2offer.self.LinkList;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/9 下午4:59
 * @Description:
 */
public class A18DelNode {

    /**
     * O(1)时间内删除某节点
     * 思路: 将该节点的下一节点的指和指向 赋值到该节点, 删除下一节点
     * @param linkList
     * @param needDelete
     */
    public void delNode(LinkList linkList, LinkList needDelete) {
        // TODO needDelete是否为linkList的一个节点
        LinkList nextNode = needDelete.getNext();
        if (nextNode != null) {
            needDelete.setVal(nextNode.getVal());
            if (nextNode.getNext() != null) {
                needDelete.setNext(nextNode.getNext());
            }
            else {
                needDelete.setNext(null);
            }
            nextNode.setNext(null);
        }
        else {
            // 删除尾节点, 找到次尾节点, next设为null, 如何O(1)找到单链表的上一个node, 无解
            // 只有O(n) 时间复杂度
            // 总时间复杂度 = [(n-1)*O(1) + O(n)] / n  只有一次是O(n) 近似于O(1)
            while (linkList.getNext() != needDelete) {  // 将一个node的next设为null, java的垃圾回收会回收掉没用的needDelete
                linkList = linkList.getNext();
            }
            linkList.setNext(null);

        }

    }

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        LinkList node4 = new LinkList(4);
        LinkList node3 = new LinkList(3, node4);
        LinkList node2 = new LinkList(2, node3);
        LinkList node1 = new LinkList(1, node2);
        A18DelNode delNode = new A18DelNode();
        delNode.delNode(node1, node4);
        linkList.printLink(node1);

    }
}
