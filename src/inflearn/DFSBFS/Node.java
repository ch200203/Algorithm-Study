package inflearn.DFSBFS;

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
    public void DFS(Node rot) {

    }

    public static void main(String args[]) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.lt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);


    }
}
