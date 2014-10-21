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

    //状況に合った子ノードを返す(DFS用)
    private BinaryTree[] getChildrenDfs() {
        BinaryTree[] o;
        if (left != null && right != null) {
            o = new BinaryTree[]{right, left};
        } else if (left != null) {
            o = new BinaryTree[]{left};
        } else if (right != null) {
            o = new BinaryTree[]{right};
        } else {
            o = new BinaryTree[]{};
        }
        return o;
    }

    //状況に合った子ノードを返す(BFS用)
    private BinaryTree[] getChildrenBfs() {
        BinaryTree[] o;
        if (left != null && right != null) {
            o = new BinaryTree[]{left, right};
        } else if (left != null) {
            o = new BinaryTree[]{left};
        } else if (right != null) {
            o = new BinaryTree[]{right};
        } else {
            o = new BinaryTree[]{};
        }
        return o;
    }
}
