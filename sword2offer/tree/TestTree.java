package sword2offer.tree;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/19 下午4:42
 * @Description:
 */
public class TestTree {

    public Tree tree;
    public static void main(String[] args) {
        Tree tree = new Tree(0);
        Tree treeA = new Tree(1);
        Tree treeB = new Tree(2);
        Tree treeAA = new Tree(5);
        Tree treeAB = new Tree(3);
        Tree treeBA = new Tree(4);
        Tree treeBB = new Tree(6);
        tree.setLeft(treeA);
        tree.setRight(treeB);
        treeA.setLeft(treeAA);
        treeA.setRight(treeAB);
        treeB.setLeft(treeBA);
        treeB.setRight(treeBB);

        Tree.preOrder(tree);
        System.out.println();
        Tree.preOrderRec(tree);
        System.out.println();
        Tree.midOrder(tree);
        System.out.println();
        Tree.midOrderRec(tree);
        System.out.println();
        Tree.postOrder(tree);
        System.out.println();
        Tree.postOrderRec(tree);
    }
}
