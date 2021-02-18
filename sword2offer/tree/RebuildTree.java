package sword2offer.tree;

import java.util.Arrays;

/**
 * @Author: chen.wenbo
 * @Date: 2021/2/7 下午3:11
 * @Description:
 */
public class RebuildTree {

    // 根据前序遍历nums1和中需遍历nums2结果, 重建二叉树
    // nums1: {1,2,4,7,3,5,6,8}    nums2: {4,7,2,1,5,3,8,6}
    public Tree rebuildTree(int[] nums1, int[] nums2){

        // nums1 的第一个值1, 就是根节点的值
        // nums2 中根节点左侧就是左子树{4,7,2}, 右侧就是右子树{5,3,8,6}
        // nums1 中{2,4,7}和{3,5,6,8} 就是左右子树的元素
        int root = nums1[0], index = 0;
        Tree tree = new Tree(root);
        for (int i = 0; i<nums2.length; i++) {
            if (nums2[i] == root) {
                index = i;
                break;
            }
        }
        int[] n1 = new int[index];
        int[] n2 = new int[index];
        for (int i = 0; i<index; i++) {
            n1[i] = nums1[i+1];
            n2[i] = nums2[i];
        }
        int[] n3 = new int[nums2.length - index - 1];
        int[] n4 = new int[nums2.length - index - 1];
        for (int i = index + 1; i < nums2.length; i++) {
            n3[i-index-1] = nums1[i];
            n4[i-index-1] = nums2[i];
        }
        System.out.println(Arrays.toString(n1));
        System.out.println(Arrays.toString(n2));
        System.out.println(Arrays.toString(n3));
        System.out.println(Arrays.toString(n4));
        if (n1.length != 0 ) {
            this.rebuildTree(n1, n2);
        }
        if (n3.length != 0) {
            this.rebuildTree(n3, n4);
        }

        return new Tree(1);
    }

    public static void main(String[] args) {
        RebuildTree rebuildTree = new RebuildTree();
        rebuildTree.rebuildTree(new int[] {1,2,4,7,3,5,6,8}, new int[] {4,7,2,1,5,3,8,6});
    }
}
