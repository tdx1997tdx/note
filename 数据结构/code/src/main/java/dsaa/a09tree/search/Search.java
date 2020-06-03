package dsaa.a09tree.search;

import dsaa.a09tree.BinaryTreeNode;

public class Search {
    public static BinaryTreeNode preSearch(BinaryTreeNode root, int value) {
        if (root == null) return null;
        if (value == root.value) {
            return root;
        }
        BinaryTreeNode left = preSearch(root.left, value);
        BinaryTreeNode right = preSearch(root.right, value);
        //递归向上传递
        if (left != null) {
            return left;
        } else if (right != null) {
            return right;
        }
        return null;
    }

    public static BinaryTreeNode inSearch(BinaryTreeNode root, int value) {
        if (root == null) return null;
        BinaryTreeNode left = inSearch(root.left, value);
        if (value == root.value) {
            return root;
        }
        BinaryTreeNode right = inSearch(root.right, value);
        if (left != null) {
            return left;
        } else if (right != null) {
            return right;
        }
        return null;

    }

    public static BinaryTreeNode postSearch(BinaryTreeNode root, int value) {
        if (root == null) return null;
        BinaryTreeNode left = postSearch(root.left, value);
        BinaryTreeNode right = postSearch(root.right, value);
        if (value == root.value) {
            return root;
        }
        if (left != null) {
            return left;
        } else if (right != null) {
            return right;
        }
        return null;
    }
}
