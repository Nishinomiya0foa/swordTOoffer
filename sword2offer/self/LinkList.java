package sword2offer.self;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/7 下午2:34
 * @Description:
 */
public class LinkList {

    private int val;

    public LinkList getNext() {
        return next;
    }

    public boolean haveNext() {
        return this.next != null;
    }

    public void setNext(LinkList linkList) {
        this.next = linkList;
    }

    private LinkList next;


    public LinkList(){}
    public LinkList(int val) {
        this.val = val;
    }

    public LinkList(int val, LinkList node) {
        this.val = val;
        this.next = node;
    }

    public void printLink(LinkList node) {
        System.out.print(node.val);
        if (node.next != null) {
            System.out.print("->");
            this.printLink(node.next);
        }
        else {
            System.out.println();
        }
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
