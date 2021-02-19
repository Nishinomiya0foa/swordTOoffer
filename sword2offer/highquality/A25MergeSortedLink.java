package sword2offer.highquality;

import sword2offer.self.LinkList;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/19 上午10:10
 * @Description:
 */
public class A25MergeSortedLink {

    public LinkList mergeSortedLink(LinkList head1, LinkList head2) {
        LinkList targetNode = new LinkList();
        LinkList resultNode = targetNode;
        boolean head2Smaller;
        while (head1 != null || head2 != null) {
            if (head1 == null) {
                head2Smaller = true;
            }
            else if (head2 == null) {
                head2Smaller = false;
            }
            else {
                head2Smaller = head1.getVal() >= head2.getVal();
            }
            if (head2Smaller) {
                targetNode.setNext(head2);
                targetNode = targetNode.getNext();
                head2 = head2.getNext();
            }
            else {
                targetNode.setNext(head1);  // 设置当前位
//                System.out.println(targetNode.getNext().getVal());

                targetNode = targetNode.getNext();  // 让targetNode往后移动一位
//                System.out.println(head1.getVal());
//                System.out.println(targetNode.getVal());
//                System.out.println(targetNode.getNext().getVal());
                head1 = head1.getNext();
            }
        }

        return resultNode.getNext();
    }

    public static void main(String[] args) {
        LinkList node6 = new LinkList(6);
        LinkList node5 = new LinkList(5, node6);
        LinkList node4 = new LinkList(4, node5);
        LinkList node3 = new LinkList(3, node4);
        LinkList node2 = new LinkList(2, node3);
        LinkList node1 = new LinkList(1, node2);

        A25MergeSortedLink mergeSortedLink = new A25MergeSortedLink();
        LinkList targetNode = mergeSortedLink.mergeSortedLink(node1, null);
        while (targetNode != null) {
            System.out.println(targetNode.getVal());
            targetNode = targetNode.getNext();
        }

    }
}
