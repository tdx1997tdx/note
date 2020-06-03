package dsaa.a09tree.traverse;

import dsaa.a09tree.BinaryTreeNode;

public class Traverse {
    public static void preOrder(BinaryTreeNode root) {
        if (root == null) return;
        System.out.println(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(BinaryTreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
    }

    public static void postOrder(BinaryTreeNode root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.value);
    }
}
