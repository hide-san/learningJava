package learning;

import org.junit.Test;

public class BinaryTreeTest {
    BinaryTree t =
            new BinaryTree("S", new BinaryTree("a", new BinaryTree("c", null, null),
                    new BinaryTree("d", null, null)), new BinaryTree("b", new BinaryTree(
                    "e", null, null), new BinaryTree("f", null, null)));

    @Test
    public void testDfs() throws Exception {
        System.out.println("DFSの結果");
        t.dfs(t, "e");
    }

    @Test
    public void testBfs() throws Exception {
        System.out.println("BFSの結果");
        t.bfs(t, "e");
    }

    @Test
    public void testDfsRecursiveCall() throws Exception {
        System.out.println("DFS Recursive Call の結果");
        t.dfsRecursiveCall(t, "e");
    }
}