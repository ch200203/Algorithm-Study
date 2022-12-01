package inflearn.DFSBFS;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_7 {
    Node root;

    public static void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0; // root Node의 level = 0

        while(!queue.isEmpty()) {
            // 레벨별 queue의 원소의 갯수
            int len = queue.size();
            System.out.println(level + " : ");
            for(int i = 0; i < len; i++) {
                Node cur = queue.poll(); // 노의 주소값
                System.out.print(cur.data + " ");
                // cur == null 이면 말단 노드
                if(cur.lt != null) queue.offer(cur.lt); 
                if(cur.rt != null) queue.offer(cur.lt); 
            }
            level++;

            System.out.println();

        }
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root); // root 노드
    }
}

// 이진트리 순회
class Node {
    int data;
    Node lt, rt; // 객체주소 저장

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

