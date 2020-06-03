package dsaa.a09tree;

import dsaa.a09tree.traverse.Traverse;
import org.junit.Before;
import org.junit.Test;

public class OrderTest {
    BinaryTreeNode root;

    @Before
    public void before() {
        root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
        root.right.left = new BinaryTreeNode(6);
    }

    @Test
    public void test1() {
        Traverse.preOrder(root);
    }

    @Test
    public void test2() {
        Traverse.inOrder(root);
    }

    @Test
    public void test3() {
        Traverse.postOrder(root);
    }
}
