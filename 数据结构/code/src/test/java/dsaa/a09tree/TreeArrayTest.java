package dsaa.a09tree;

import dsaa.a09tree.treeArrayTransform.TreeToArray;
import org.junit.Before;
import org.junit.Test;

public class TreeArrayTest {
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
        int res = TreeToArray.calHigh(root, 0);
        System.out.println(res);
    }

    @Test
    public void test2() {
        int[] res = TreeToArray.treeToArray(root);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    @Test
    public void test3() {
        int[] res = TreeToArray.treeToArray(root);
        BinaryTreeNode root2 = TreeToArray.arrayToTree(res);
        int[] res2 = TreeToArray.treeToArray(root2);
        for (int i : res2) {
            System.out.print(i + " ");
        }
    }
}
