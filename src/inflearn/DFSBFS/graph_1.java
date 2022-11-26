package inflearn.DFSBFS;

// Recursive, Tree, Graph(DFS, BFS 기초)
// 재귀함수 
public class graph_1 {
    public static void main(String[] args) {
        int N = 3;
        DFS(N);      

        // 피보나치 재귀 구현(메모제이션)
        int n_4 = 45;
        fibo = new int[n_4 + 1];
        DFS_4(n_4);
        for(int i = 1; i <= n_4; i++) System.out.print(fibo[i] + " ");
    }

    // 재귀함수는 Stack 프레임이 사용이 된다.
    public static void DFS(int n) {
        if(n == 0) return;
        else  {
            DFS(n -1);
            System.out.println(n);
        }
    }

    // 2진수 재귀로 구현하기
    public static void DFS_2(int n ){
        if(n == 0) return;
        else  {
            DFS_2(n -1);
            System.out.println(n % 2 + " ");
        }
    }

    // 팩토리얼 재귀로 구현하기
    public static int DFS_3(int n){
        if(n == 1) return 1;
        else  return n * DFS_3(n-1);
    }

    // 피보나치수열 재귀함수로 구현하기(메모제이션)
    // 단, 피보나치는 for문으로 짜는게 효율적임.
    static int[] fibo;

    public static int DFS_4(int n){
        if(fibo[n] > 0) return fibo[n]; // 메모제이션 활용 *****
        if(n == 1 || n == 2) return fibo[n] = 1;
        else  return fibo[n] = DFS_4(n - 2) + DFS_4(n - 1);
    }
    
    // for문으로 구현한 피보나치 수열
    public static void fiboFor() {
        int n = 45;
        int[] arr = new int[n + 1];
        
        arr[1] = 1;
        arr[2] = 1;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.print(arr[i] + " ");
        }
    }


}
