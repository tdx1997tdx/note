package dsaa.a09tree;

import dsaa.a09tree.search.Search;
import org.junit.Before;
import org.junit.Test;

public class SearchTest {
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
        int res = Search.preSearch(root, 3).value;
        System.out.println(res);
    }

    @Test
    public void test2() {
        int res = Search.inSearch(root, 3).value;
        System.out.println(res);
    }

    @Test
    public void test3() {
        int res = Search.postSearch(root, 3).value;
        System.out.println(res);
    }
}
