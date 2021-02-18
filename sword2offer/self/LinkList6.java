package sword2offer.self;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/7 下午2:29
 * @Description:
 */
public class LinkList6 {

    // 递归 倒序打印链表
    // TODO 也可以用栈实现
    public void printLinkList(LinkList node) {
        LinkList newNode = node.getNext();
        if (newNode != null) {  // 递归的存在,会先执行更深层的代码,第一层的最后才执行,具有栈的特性
            this.printLinkList(newNode);
        }
        System.out.println(node.getVal());
    }

    public static void main(String[] args) {
        LinkList node4 = new LinkList(4);
        LinkList node3 = new LinkList(3, node4);
        LinkList node2 = new LinkList(2, node3);
        LinkList node1 = new LinkList(1, node2);
        // 打印链表
        LinkList6 linkList6 = new LinkList6();
        linkList6.printLinkList(node1);
    }
}
