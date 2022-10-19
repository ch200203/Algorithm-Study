package inflearn.DFSBFS;


// 이진트리 순회
public class Node {
    int data;
    Node lt, rt; // 객체주소 저장

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}


class Main {
    Node root;
    public void DFS(Node root) {
        if(root == null) return; // root node가 null 인 경우 => 마지막 노드임
        else {
            // System.out.print("root.data :: " + root.data + " "); // 전위순회
            DFS(root.lt);
            // System.out.print("root.data :: " + root.data + " "); // 중위순회
            DFS(root.rt);
            // System.out.print("root.data :: " + root.data + " "); // 후위순회
        }
    }

    public static void main(String args[]) {
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
