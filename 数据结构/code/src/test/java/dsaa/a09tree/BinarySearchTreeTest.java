package dsaa.a09tree;

import dsaa.a09tree.binarySearchTree.BinarySearchTree;
import dsaa.a09tree.traverse.Traverse;
import org.junit.Test;

public class BinarySearchTreeTest {
    BinaryTreeNode root;

    @Test
    public void test1() {
        int[] arr = {7, 3, 10, 12, 5, 1, 9};
        BinaryTreeNode btn = BinarySearchTree.createTree(arr);
        Traverse.preOrder(btn);
    }

    @Test
    public void test2() {
        int[] arr = {7, 3, 10, 12, 5, 1, 9};
        BinaryTreeNode btn = BinarySearchTree.createTree(arr);
        BinaryTreeNode btn2 = BinarySearchTree.search(btn, 5);
        System.out.println(btn2.value);
    }

    @Test
    public void test3() {
        int[] arr = {7, 3, 10, 12, 5, 1, 9};
        BinaryTreeNode btn = BinarySearchTree.createTree(arr);
        Traverse.preOrder(btn);
        BinarySearchTree.delete(btn, 12);
        System.out.println("========");
        Traverse.preOrder(btn);
    }

    @Test
    public void test4() {
        int[] arr = {7, 3, 10, 12, 5, 1, 9};
        BinaryTreeNode btn = BinarySearchTree.createTree(arr);
        Traverse.preOrder(btn);
        BinarySearchTree.delete(btn, 10);
        System.out.println("========");
        Traverse.preOrder(btn);
    }
}
