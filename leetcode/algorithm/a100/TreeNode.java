package leetcode.algorithm.a100;

import java.util.Objects;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/25 下午1:29
 * @Description:
 */
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {

    }
    TreeNode(int val) {
        this.val = val;

    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TreeNode)) return false;
        TreeNode treeNode = (TreeNode) o;
        return val == treeNode.val &&
                Objects.equals(left, treeNode.left) &&
                Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }

    @Override
    public String toString(){
//        String s = "    Node: " + this.val + "    SonA: " + this.left  + "    SonB: " + this.right;
        String s = String.valueOf(this.val);
        return s;
    }
}
