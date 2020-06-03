package dsaa.a10graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graphg {
    private int[][] graph;//邻接矩阵图
    private boolean[] isVisit;
    private int nodeNum;

    public Graphg(int[][] graph, int nodeNum) {
        this.graph = graph;
        this.nodeNum = nodeNum;
    }

    public void DFS() {
        if (graph == null) return;
        Stack<Integer> stack = new Stack<>();
        isVisit = new boolean[nodeNum];
        stack.push(0);
        isVisit[0] = true;
        while (!stack.isEmpty()) {
            int node = stack.pop();
            System.out.print(node + "->");
            for (int i = 0; i < nodeNum; i++) {
                if (graph[node][i] == 1 && !isVisit[i]) {
                    stack.push(i);
                    isVisit[i] = true;
                }
            }
        }
    }

    public void BFS() {
        if (graph == null) return;
        Queue<Integer> queue = new LinkedList<>();
        isVisit = new boolean[nodeNum];
        queue.offer(0);
        isVisit[0] = true;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + "->");
            for (int i = 0; i < nodeNum; i++) {
                if (graph[node][i] == 1 && !isVisit[i]) {
                    queue.offer(i);
                    isVisit[i] = true;
                }
            }
        }
    }
}
