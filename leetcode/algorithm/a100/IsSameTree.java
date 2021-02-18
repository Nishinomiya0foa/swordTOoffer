package leetcode.algorithm.a100;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: chen.wenbo
 * @Date: 2021/1/25 下午1:31
 * @Description:
 */
public class IsSameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<TreeNode> pL = this.handleTreeNode(p);
        List<TreeNode> qL = this.handleTreeNode(q);
        for (int i = 0; i<pL.size(); i ++) {
            TreeNode pOne = pL.get(i);
            TreeNode qOne = qL.get(i);
            if ((pOne != null && qOne != null) || (pOne == null && qOne == null)) {
                if (pOne != null) {
                    if (pOne.val != qOne.val) {
                        return false;
                    }
                }
            }
            else {
                return false;
            }
        }
        System.out.println(pL);
        return true;
    }

    public List<TreeNode> handleTreeNode(TreeNode p) {
        List<TreeNode> pL = new ArrayList<>(), qL = new ArrayList<>();
        pL.add(p);
        int depth = 1;
        boolean flag =false;
        do {
            double lastN = Math.pow(2, depth - 1);
            depth += 1;
            for (int j = depth -2; j < lastN; j++) {
                TreeNode tmpNode = pL.get(j);
                if (tmpNode != null) {
                    pL.add(tmpNode.left);
                    pL.add(tmpNode.right);
                }
                else {
                    pL.add(null);
                    pL.add(null);
                }
                if (!flag) {
                    flag = tmpNode == null;
                }
            }
        } while (!flag);
        return pL;
    }

    public static void main(String[] args) {
        TreeNode tAAA = new TreeNode(5);
        TreeNode tAAB = new TreeNode(4);
        TreeNode tAA = new TreeNode(3, null, tAAA);
        TreeNode tAB = new TreeNode(2, tAAB, null);
        TreeNode tA = new TreeNode(1, tAB, tAA);
//        System.out.println(tA);

        IsSameTree isSameTree = new IsSameTree();

        System.out.println(isSameTree.isSameTree(tA, tAB));
//        System.out.println(isSameTree.isSameTree(tAB, tAB));
    }
}
