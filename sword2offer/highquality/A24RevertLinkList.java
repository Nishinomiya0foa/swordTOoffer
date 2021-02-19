package sword2offer.highquality;

import sword2offer.self.LinkList;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/18 下午5:06
 * @Description:
 */
public class A24RevertLinkList {

    public LinkList revertLink(LinkList head) {

        if(head==null)
            return null;
        //head为当前节点，如果当前节点为空的话，那就什么也不做，直接返回null；
        LinkList pre = null;
        LinkList next = null;
        //当前节点是head，pre为当前节点的前一节点，next为当前节点的下一节点
        //需要pre和next的目的是让当前节点从pre->head->next1->next2变成pre<-head next1->next2
        //即pre让节点可以反转所指方向，但反转之后如果不用next节点保存next1节点的话，此单链表就此断开了
        //所以需要用到pre和next两个节点
        //1->2->3->4->5
        //1<-2<-3 4->5
        while(head!=null){
            //做循环，如果当前节点不为空的话，始终执行此循环，此循环的目的就是让当前节点从指向next到指向pre
            //如此就可以做到反转链表的效果
            //先用next保存head的下一个节点的信息，保证单链表不会因为失去head节点的原next节点而就此断裂
            next = head.getNext();
            //保存完next，就可以让head从指向next变成指向pre了，代码如下
            head.setNext(pre);
            //head指向pre后，就继续依次反转下一个节点
            //让pre，head，next依次向后移动一个节点，继续下一次的指针反转
            pre = head;
            head = next;
        }
        //如果head为null的时候，pre就为最后一个节点了，但是链表已经反转完毕，pre就是反转后链表的第一个节点
        //直接输出pre就是我们想要得到的反转后的链表
        return pre;

    }

    public LinkList reverseLink2(LinkList head) {
        if (head == null) {
            return null;
        }

        LinkList pre = null;
        LinkList next = null;
        while (head != null) {
            next = head.getNext();
            head.setNext(pre);  // head之后的信息已经保存在next了, 因此将head指向pre
            pre = head;  // 将head赋值给pre
            head = next;  // 指向下一节点

        }
        return pre;
    }

    public static void main(String[] args) {
        LinkList node6 = new LinkList(6);
        LinkList node5 = new LinkList(5, node6);
        LinkList node4 = new LinkList(4, node5);
        LinkList node3 = new LinkList(3, node4);
        LinkList node2 = new LinkList(2, node3);
        LinkList node1 = new LinkList(1, node2);

        A24RevertLinkList revertLinkList = new A24RevertLinkList();
        LinkList reversedLink =  revertLinkList.revertLink(node1);
        while(true){
            System.out.println(reversedLink.getVal());
            if (!reversedLink.haveNext()) {
                break;
            }
            reversedLink = reversedLink.getNext();
        }
    }
}
