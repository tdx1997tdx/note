package dsaa.a11dijstra;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static int nodeNum;
    private static int edgeNum;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        nodeNum = in.nextInt();
        edgeNum = in.nextInt();
        Graph g = new Graph(nodeNum);
        for (int i = 0; i < edgeNum; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int d = in.nextInt();
            int p = in.nextInt();
            g.build(a, b, d, p);
        }
        int begin = in.nextInt();
        int end = in.nextInt();
        int[] res = g.floyd(begin, end);
        System.out.println(res[0] + " " + res[1]);

    }


}

class Graph {
    private int[][] disGraph;//邻接矩阵，记录最短距离
    private int[][] costGraph;//邻接矩阵，记录最少消耗
    private int nodeNum;

    public Graph(int nodeNum) {
        this.nodeNum = nodeNum;
        this.disGraph = new int[nodeNum + 1][nodeNum + 1];
        this.costGraph = new int[nodeNum + 1][nodeNum + 1];
    }

    public int[] dijkstra(int beginNode, int endNode) {
        int[] result = new int[2];
        boolean[] isVisit = new boolean[nodeNum + 1];//判断是否走过
        int[] dis = new int[nodeNum + 1];//最小距离
        int[] cost = new int[nodeNum + 1];//最小消耗
        //初始化
        for (int i = 0; i < nodeNum + 1; i++) {
            dis[i] = Integer.MAX_VALUE;
            cost[i] = Integer.MAX_VALUE;
        }

        Queue<Integer> q = new LinkedList<>();
        //将初始节点放入队列中
        q.offer(beginNode);
        dis[beginNode] = 0;
        cost[beginNode] = 0;
        while (!q.isEmpty()) {
            int n = q.poll();
            for (int i = 1; i <= nodeNum; i++) {
                //查找该节点相邻的节点
                if (disGraph[n][i] != 0) {
                    //搜索该节点周边节点，如果距离小，替换
                    if (disGraph[n][i] + dis[n] < dis[i]) {
                        dis[i] = disGraph[n][i] + dis[n];
                        cost[i] = costGraph[n][i] + cost[n];
                    } else if (disGraph[n][i] + dis[n] == dis[i] && costGraph[n][i] + cost[n] < cost[i]) {
                        cost[i] = costGraph[n][i] + cost[n];
                    }
                    //如果该节点没有遍历过，加入队列中
                    if (!isVisit[i]) {
                        q.offer(i);
                        isVisit[i] = true;
                    }
                }

            }
        }
        result[0] = dis[endNode];
        result[1] = cost[endNode];
        return result;
    }

    public int[] floyd(int beginNode, int endNode) {
        int[] result = new int[2];
        int[][] dis = new int[nodeNum + 1][nodeNum + 1];//两点间最小距离
        int[][] cost = new int[nodeNum + 1][nodeNum + 1];//两点间最小消耗
        //初始化距离和花费数组
        for (int i = 1; i <= nodeNum; i++) {
            for (int j = 1; j <= nodeNum; j++) {
                //有路可走
                if (disGraph[i][j] != 0) {
                    dis[i][j] = dis[j][i] = disGraph[i][j];
                    cost[i][j] = cost[j][i] = costGraph[i][j];
                } else {
                    dis[i][j] = Integer.MAX_VALUE;
                    cost[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        //遍历所有节点
        for (int i = 1; i <= nodeNum; i++) {
            //遍历该节点的相邻节点
            for (int j = 1; j <= nodeNum; j++) {
                //固定住j,对于j而言判断最小值
                for (int k = 1; k <= nodeNum; k++) {
                    //判断
                    if (dis[j][k] > dis[j][i] + dis[i][k]) {
                        dis[j][k] = dis[k][j] = dis[j][i] + dis[i][k];
                        cost[j][k] = cost[k][j] = cost[j][i] + cost[i][k];
                    } else if (dis[j][k] == dis[j][i] + dis[i][k] && cost[j][k] > cost[j][i] + cost[i][k]) {
                        cost[j][k] = cost[k][j] = cost[j][i] + cost[i][k];
                    }

                }
            }
        }
        result[0] = dis[beginNode][endNode];
        result[1] = cost[beginNode][endNode];
        return result;
    }

    //建图
    public void build(int a, int b, int d, int p) {
        if (this.disGraph[a][b] == 0 || this.disGraph[a][b] > d) {
            this.disGraph[a][b] = d;
            this.disGraph[b][a] = d;
            this.costGraph[a][b] = p;
            this.costGraph[b][a] = p;
        } else if (this.disGraph[a][b] == d && this.costGraph[a][b] > p) {
            this.costGraph[a][b] = p;
            this.costGraph[b][a] = p;
        }

    }


}
