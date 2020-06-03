package dsaa.a09tree.treeArrayTransform;

import dsaa.a09tree.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeToArray {

    public static int[] treeToArray(BinaryTreeNode root) {
        int high = calHigh(root, 0);
        //等比数列求和
        int arrLength = (int) (Math.pow(2, high) - 1);
        int[] arr = new int[arrLength];
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        //出栈的次数
        int count = 0;
        queue.offer(root);
        while (count < arrLength) {
            BinaryTreeNode btn = queue.poll();
            arr[count] = btn.value;
            count++;
            if (btn.left != null) {
                queue.offer(btn.left);
            } else {
                queue.offer(new BinaryTreeNode(0));
            }
            if (btn.right != null) {
                queue.offer(btn.right);
            } else {
                queue.offer(new BinaryTreeNode(0));
            }
        }
        return arr;
    }

    public static BinaryTreeNode arrayToTree(int[] arr) {
        BinaryTreeNode root = new BinaryTreeNode(arr[0]);
        createTree(arr, root, 0);
        return root;
    }

    public static void createTree(int[] arr, BinaryTreeNode root, int index) {
        if (root == null) return;
        if (index * 2 + 1 < arr.length && arr[index * 2 + 1] != 0) {
            root.left = new BinaryTreeNode(arr[index * 2 + 1]);
        } else {
            root.left = null;
        }
        if (index * 2 + 2 < arr.length && arr[index * 2 + 2] != 0) {
            root.right = new BinaryTreeNode(arr[index * 2 + 2]);
        } else {
            root.right = null;
        }
        createTree(arr, root.left, index * 2 + 1);
        createTree(arr, root.right, index * 2 + 2);

    }

    //统计树的高度
    public static int calHigh(BinaryTreeNode root, int layer) {
        if (root == null) return layer;
        int leftLayer = calHigh(root.left, layer + 1);
        int rightLayer = calHigh(root.left, layer + 1);
        return leftLayer > rightLayer ? leftLayer : rightLayer;
    }
}
