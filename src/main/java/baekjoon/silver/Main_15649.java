package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// 백트래킹 (1)
public class Main_15649 {
    // 이미 방문한 노드(값)이라면 다음 노드를 탐색하도록 하기 위해(유망한 노드인지 검사하기 위해) N 크기의 boolean 배열을 생성하고, 탐색과정에서 값을 담을 int 배열 arr 을 생성
    public static boolean[] visit;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        
        arr = new int[M];
        visit = new boolean[N];

        dfs(N, M, 0); // 루트 노드는 depth가 0이다.
        // 마지막에 출력
        System.out.println(sb);
        
    }
    
    public static void dfs(int N, int M, int depth) {
        // // depth를 통해 재귀가 깊어질 때마다 depth를 1씩 증가시켜 M과 같아지면
        //  더이상 재귀를 호출하지 않고 탐색과정 중 값을 담았던 arr 배열을 출력해주고 return
        if(depth == M) {
            for(int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            // 만양 해당 노드를 방문하지 않았다면
            if(!visit[i]) {
                visit[i] = true; // 방문처리
                arr[depth] = i + 1;// 해당 깊이를 index로 하여 i + 1 값 저장
                dfs(N, M, depth + 1); // 다음 노드를 방문하기위해 depth를 1증가시켜 재귀호출


                // 하위 노드를 방문하고 돌아오면 방문노드를 방문하지 않은 상태로 변경한다.
                visit[i] = false;
            }
        }
        // 즉, 중복되는 수는 담을 수 없기 때문에 방문할 필요가 없음
        // 해당 index가 방문하지 않은 값일 때만 재귀호출을 해주면 됨 => 백트래킹
    }
}
