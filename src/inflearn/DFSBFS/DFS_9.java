package inflearn.DFSBFS;

import java.util.LinkedList;
import java.util.Queue;

public class DFS_9 {
    Node root;

    private int DFS(int L, Node root) {
        // 말단 노드인지 확인
        if(root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
    }

    // 노드 최단 경로 탐색(레벨탐색) => BFS가 더 효율적임
    private int BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        int L = 0;
        // 최초 탐색 root 삽입
        queue.offer(root);
        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i = 0; i < len; i++) {
                Node cur = queue.poll();
                // 말단 노드인지 확인
                if(cur.lt == null && cur.rt == null) return L;
                if(cur.lt != null) queue.offer(cur.lt);
                if(cur.rt != null) queue.offer(cur.rt);
            }
            L++;
        }

        return -1;
    }

    public static void main(String[] args) {
        // 이진트리 구성
        DFS_9 tree = new DFS_9();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        System.out.println(tree.DFS(0, tree.root));
        System.out.println(tree.BFS(tree.root));
    }
}
