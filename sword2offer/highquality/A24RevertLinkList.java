package sword2offer.highquality;

import sword2offer.self.LinkList;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/18 下午5:06
 * @Description:
 */
public class A24RevertLinkList {

    public LinkList revertLink(LinkList linkNode) {

        LinkList nextNode;
        LinkList lastNode = null;
        LinkList targetNode = linkNode;
        while (true) {
            if (lastNode == null) {
                lastNode = linkNode;
                if (linkNode.haveNext()) {
                    linkNode = linkNode.getNext();

                }
            }
            else {
                if (linkNode.haveNext()) {
                    linkNode = linkNode.getNext();
                }
                targetNode = linkNode;
                targetNode.setNext(lastNode);
            }
        }
    }

    public static void main(String[] args) {
        LinkList node6 = new LinkList(6);
        LinkList node5 = new LinkList(5, node6);
        LinkList node4 = new LinkList(4, node5);
        LinkList node3 = new LinkList(3, node4);
        LinkList node2 = new LinkList(2, node3);
        LinkList node1 = new LinkList(1, node2);

        A24RevertLinkList revertLinkList = new A24RevertLinkList();
        revertLinkList.revertLink(node1);
    }
}
