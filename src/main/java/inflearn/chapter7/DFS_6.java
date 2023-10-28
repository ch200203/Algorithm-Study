package inflearn.chapter7;

public class DFS_6 {
    /**
     * 부분집합 구하기
     */
    static int n; // 원소의 갯수
    static int[] ch; // 체크 배열

     public static void main(String[] args) {
        n = 3;
        ch = new int[n + 1];
        dfs(1);
     }

     private static void dfs(int L) {
        if(L == n + 1) {
            String tmp = "";
            for(int i = 0; i <= n; i++) {
                if(ch[i] == 1) tmp += (i + " ");
            }
            // 공집합이 아닌 경우에만 출력
            if(tmp.length() > 0) System.out.println(tmp);
        } else {
            ch[L] = 1;
            dfs(L + 1); // 이진트리의 왼쪽
            ch[L] = 0;
            dfs(L + 1); // 이진트리의 오른쪽
        }
     }
}
