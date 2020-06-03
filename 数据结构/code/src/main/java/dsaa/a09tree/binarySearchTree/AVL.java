package dsaa.a09tree.binarySearchTree;

import dsaa.a09tree.BinaryTreeNode;

public class AVL {
    public static boolean isAVL(BinaryTreeNode btn) {
        if (btn == null) return true;
        int leftHeigh = getTreeHight(btn.left);
        int rightHeigh = getTreeHight(btn.right);
        return Math.abs(leftHeigh - rightHeigh) <= 1 && isAVL(btn.left) && isAVL(btn.right);
    }

    public static int getTreeHight(BinaryTreeNode btn) {
        if (btn == null) {
            return 0;
        }
        return Math.max(getTreeHight(btn.left), getTreeHight(btn.right));
    }
}
