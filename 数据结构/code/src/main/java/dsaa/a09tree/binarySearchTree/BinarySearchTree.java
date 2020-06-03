package dsaa.a09tree.binarySearchTree;

import dsaa.a09tree.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    public static BinaryTreeNode createTree(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        BinaryTreeNode btn = new BinaryTreeNode(arr[0]);
        ;
        for (int i = 1; i < arr.length; i++) {
            create(btn, arr[i]);
        }
        return btn;
    }

    private static void create(BinaryTreeNode btn, int number) {
        //不为空，判断大小
        if (number > btn.value) {
            if (btn.right == null) {
                btn.right = new BinaryTreeNode(number);
                btn.right.parent = btn;
                return;
            }
            create(btn.right, number);
        } else {
            if (btn.left == null) {
                btn.left = new BinaryTreeNode(number);
                btn.left.parent = btn;
                return;
            }
            create(btn.left, number);
        }
    }

    public static BinaryTreeNode search(BinaryTreeNode btn, int num) {
        BinaryTreeNode res = null;
        if (num > btn.value) {
            res = search(btn.right, num);
        } else if (num < btn.value) {
            res = search(btn.left, num);
        } else {
            res = btn;
        }
        return res;
    }

    //删除节点
    public static void delete(BinaryTreeNode btn, int num) {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(btn);
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();
            if (node.value == num) {
                if (node.left == null && node.right == null) {
                    if (node.parent.left.value == num) {
                        node.parent.left = null;
                    } else {
                        node.parent.right = null;
                    }

                } else if (node.left != null && node.right == null) {
                    //左边有东西
                    if (node.parent.left.value == num) {
                        node.parent.left = node.left;
                    } else {
                        node.parent.right = node.left;
                    }

                } else if (btn.left.left == null) {
                    //右边有东西
                    if (node.parent.left.value == num) {
                        node.parent.left = node.right;
                    } else {
                        node.parent.right = node.right;
                    }
                } else {
                    //两边都有东西，找右子树的最小值并删除
                    int min = 0;
                    if (node.parent.left.value == num) {
                        min = findMinAndDelete(node.left);
                        node.parent.left.value = min;
                    } else {
                        min = findMinAndDelete(node.right);
                        node.parent.right.value = min;
                    }

                }
            }
        }
    }

    //找到树的最小值并且删除
    private static int findMinAndDelete(BinaryTreeNode btn) {
        if (btn == null) return 0;
        if (btn.left == null) return -1;
        int num = findMinAndDelete(btn.left);
        int temp = 0;
        //找到最小值
        if (num == -1) {
            temp = btn.left.value;
            if (btn.left.right == null) {
                btn.left = null;
            } else {
                btn.left = btn.left.right;
            }
        }
        return temp;
    }
}
