package dsaa.a10graph.kruskal;

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
            int res = g.kruskal();
            System.out.println(res);
        }
    }


}

class Graph {
    private int[][] graph;//邻接矩阵，记录无向图间距离
    private int nodeNum;
    private int edgeNum;
    private Queue<Edge> q;

    public Graph(int nodeNum, int edgeNum) {
        this.nodeNum = nodeNum;
        this.edgeNum = edgeNum;
        this.graph = new int[nodeNum + 1][nodeNum + 1];
        this.q = new PriorityQueue(new Comparator<Edge>() {
            @Override
            public int compare(Edge e1, Edge e2) {
                return e1.dis - e2.dis;
            }
        });
    }

    public int kruskal() {
        int res = 0;
        //并查集
        int[] checkAndSet = new int[nodeNum + 1];
        //初始化值为-1
        for (int i = 0; i < nodeNum + 1; i++) {
            checkAndSet[i] = -1;
        }
        while (!q.isEmpty()) {
            Edge e = q.poll();
            int root1 = e.node1;
            int root2 = e.node2;
            while (checkAndSet[root1] != -1) {
                root1 = checkAndSet[root1];
            }
            while (checkAndSet[root2] != -1) {
                root2 = checkAndSet[root2];
            }
            if (root1 != root2) {
                //说明无环
                checkAndSet[root2] = root1;
                res += e.dis;
            }
        }
        return res;
    }


    //建图
    public void build(int u, int v, int w) {
        if (this.graph[u][v] == 0 || this.graph[u][v] > w) {
            this.graph[u][v] = w;
            this.graph[v][u] = w;
            q.offer(new Edge(u, v, w));
        }
    }

    class Edge {
        public int node1;
        public int node2;
        public int dis;

        public Edge(int node1, int node2, int dis) {
            this.node1 = node1;
            this.node2 = node2;
            this.dis = dis;
        }
    }
}

