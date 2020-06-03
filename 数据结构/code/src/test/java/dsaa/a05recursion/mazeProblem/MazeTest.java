package dsaa.a05recursion.mazeProblem;

import org.junit.Test;

import java.util.Stack;

public class MazeTest {

    public int[][] maze = {{0, 1, 0, 0, 0}, {0, 1, 0, 1, 0}, {0, 0, 0, 0, 0}, {0, 1, 1, 1, 0}, {0, 0, 0, 1, 0}};

    @Test
    public void test1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        Stack<String> stack = new Stack<>();
        Main.mazeTrack(maze, 0, 0, 5, 5, stack);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
