package dsaa.a10graph;

import org.junit.Before;
import org.junit.Test;

public class GraphTest {
    Graphg g;

    @Before
    public void before() {
        int[][] graph = new int[][]{{0, 1, 1, 0, 0}, {1, 0, 1, 1, 1}, {1, 1, 0, 0, 0}, {0, 1, 0, 0, 0}, {0, 1, 0, 0, 0},};
        g = new Graphg(graph, 5);
    }

    @Test
    public void test1() {
        g.DFS();
    }

    @Test
    public void test2() {
        g.BFS();
    }

}
