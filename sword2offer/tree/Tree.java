package sword2offer.tree;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/7 下午3:12
 * @Description:
 *
 * 二叉树
 */
public class Tree {

    private int val;
//    private Tree dad;
    private Tree left;
    private Tree right;


    public Tree (int val, Tree left, Tree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public Tree (int val) {
        this.val = val;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public void setRight(Tree right) {
        this.right = right;
    }

}
