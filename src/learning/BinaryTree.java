package learning;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by hideo on 14/10/21.
 */
public class BinaryTree {
    BinaryTree left; //２分木の左の子ノード
    BinaryTree right; //右の子ノード
    Object data; //このノードのデータ

    //新たなノードを生成する
    public BinaryTree(Object data, BinaryTree left, BinaryTree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    //状況に合った子ノードを返す(DFS用)
    private BinaryTree[] getChildrenDfs() {
        if (left != null && right != null) {
            BinaryTree[] o = {right, left};
            return o;
        } else if (left != null && right == null) {
            BinaryTree[] o = {left};
            return o;
        } else if (left == null && right != null) {
            BinaryTree[] o = {right};
            return o;
        }
        BinaryTree[] o = {};
        return o;
    }

    public void dfs(BinaryTree t, Object goal) {
        Stack<BinaryTree> stack = new Stack<BinaryTree>();
        stack.push(t);
        while (!stack.isEmpty()) {
            BinaryTree t1 = stack.pop();
            System.out.println(t1.data + "を訪れました");
            if (t1.data == goal) {
                System.out.println("目標" + goal + "に到達しました");
                break;
            }
            for (BinaryTree t2 : t1.getChildrenDfs()) {
                stack.push(t2);
            }
        }
    }

    public boolean dfsRecursiveCall(BinaryTree t, Object goal) {
        if (t.data == goal) {
            System.out.println("目標" + goal + "に到達しました");
            return true;
        }

        System.out.println(t.data + "を訪れました");
        for (BinaryTree nextT : t.getChildrenBfs()) {
            if (dfsRecursiveCall(nextT, goal)) return true;
        }
        return false;
    }

    //状況に合った子ノードを返す(BFS用)
    private BinaryTree[] getChildrenBfs() {
        if (left != null && right != null) {
            BinaryTree[] o = {left, right};
            return o;
        } else if (left != null && right == null) {
            BinaryTree[] o = {left};
            return o;
        } else if (left == null && right != null) {
            BinaryTree[] o = {right};
            return o;
        }
        BinaryTree[] o = {};
        return o;
    }

    public void bfs(BinaryTree t, Object goal) {
        Queue<BinaryTree> queue = new ArrayDeque<BinaryTree>();
        queue.offer(t);
        while (!queue.isEmpty()) {
            BinaryTree t1 = queue.poll();
            System.out.println(t1.data + "を訪れました");
            if (t1.data == goal) {
                System.out.println("目標" + goal + "に到達しました");
                break;
            }
            for (BinaryTree t2 : t1.getChildrenBfs()) {
                queue.offer(t2);
            }
        }
    }
}
