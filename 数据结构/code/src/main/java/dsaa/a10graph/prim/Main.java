package dsaa.a10graph.prim;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int j = 0; j < T; j++) {
            int nodeNum = in.nextInt();
            int edgeNum = in.nextInt();
            Graph g = new Graph(nodeNum, edgeNum);
            for (int i = 0; i < edgeNum; i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                int w = in.nextInt();
                g.build(u, v, w);
            }
            int res = g.prim();
            System.out.println(res);
        }
    }


}

class Graph {
    private int[][] graph;//邻接矩阵，记录无向图间距离
    private int nodeNum;
    private int edgeNum;

    public Graph(int nodeNum, int edgeNum) {
        this.nodeNum = nodeNum;
        this.edgeNum = edgeNum;
        this.graph = new int[nodeNum + 1][nodeNum + 1];
    }

    public int prim() {
        int res = 0;
        //保存是否遍历过
        boolean[] isVisit = new boolean[nodeNum + 1];
        //优先队列，存储当前已遍历集合对外的权值。
        Queue<Pair> pqueue = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.dis - o2.dis;
            }
        });
        //将1以及边加入优先队列
        for (int i = 1; i <= nodeNum; i++) {
            if (graph[1][i] != 0) {
                pqueue.offer(new Pair(i, graph[1][i]));
            }
        }
        isVisit[1] = true;
        while (!pqueue.isEmpty()) {
            Pair p = pqueue.poll();
            if (isVisit[p.node]) continue;
            for (int i = 1; i <= nodeNum; i++) {
                if (graph[p.node][i] != 0) {
                    pqueue.offer(new Pair(i, graph[p.node][i]));
                }
            }
            res += p.dis;
            isVisit[p.node] = true;
        }

        return res;
    }


    //建图
    public void build(int u, int v, int w) {
        if (this.graph[u][v] == 0 || this.graph[u][v] > w) {
            this.graph[u][v] = w;
            this.graph[v][u] = w;
        }
    }

    //用于保存当前遍历过的节点集合到其他节点的距离
    class Pair {
        public int node;
        public int dis;

        public Pair(int node, int dis) {
            this.node = node;
            this.dis = dis;
        }
    }
}

