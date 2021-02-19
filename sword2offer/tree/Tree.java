package sword2offer.tree;

import java.util.Stack;

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

    // 前序 递归
    public static void preOrderRec(Tree tree) {
        if (tree==null) {
            return;
        }
        System.out.print(tree.val+ " ");
        preOrderRec(tree.left);
        preOrderRec(tree.right);
    }

    // 中序 递归
    public static void midOrderRec(Tree tree) {
        if (tree==null) {return;}
        midOrderRec(tree.left);
        System.out.print(tree.val+ " ");
        midOrderRec(tree.right);
    }

    // 后序 递归
    public static void postOrderRec(Tree tree) {
        if (tree==null) {return;}
        postOrderRec(tree.left);
        postOrderRec(tree.right);
        System.out.print(tree.val+ " ");
    }

    // 前序 循环遍历
    public static void preOrder(Tree tree) {
        if (tree==null) {
            return;
        }
        Stack<Tree> stack = new Stack<>();
        stack.push(tree);
        Tree curTree;

        while (!stack.isEmpty()) {
            curTree = stack.pop();
            System.out.print(curTree.val + " ");
            // 栈先进后出, 所以先加右侧节点, 这样才会先输出左侧节点
            if (curTree.right != null) {
                stack.add(curTree.right);
            }
            if (curTree.left != null) {
                stack.add(curTree.left);
            }
        }

    }

    // 中序 循环
    public static void midOrder(Tree tree) {
        if (tree==null) {
            return;
        }
        Stack<Tree> stack = new Stack<>();
        Tree curTree = tree;
        while (!stack.isEmpty() || curTree != null) {
            while (curTree != null) {
                stack.push(curTree);
                curTree = curTree.left;
            }
            curTree = stack.pop();
            System.out.print(curTree.val +  " ");
            curTree = curTree.right;
        }
    }

    // 后序 循环
    public static void postOrder(Tree tree) {
        if (tree==null) {
            return;
        }
        Stack<Tree> s1 = new Stack<>();
        Stack<Tree> s2 = new Stack<>();
        s1.push(tree);
        Tree curTree;

        while (!s1.isEmpty()) {
            curTree = s1.pop();
            // 中右左顺序压入栈
            s2.push(curTree);

            // 压入s1为先左后右, 保证 中右左 的顺序压入s2
            if (curTree.left != null) {
                s1.add(curTree.left);
            }
            if (curTree.right != null) {
                s1.add(curTree.right);
            }
        }

        while (!s2.isEmpty()) {
            System.out.print(s2.pop().val + " ");
        }
    }

}
