package dsaa.a09tree.delete;

import dsaa.a09tree.BinaryTreeNode;

public class Delete {
    public static BinaryTreeNode delete(BinaryTreeNode root, int value) {
        if (root == null) return null;
        if (value == root.value) {
            return root;
        }
        BinaryTreeNode left = delete(root.left, value);
        BinaryTreeNode right = delete(root.right, value);
        //删除节点
        if (left != null) {
            root.left = null;
            return null;
        } else if (right != null) {
            root.right = null;
            return null;
        }
        return null;
    }

}
