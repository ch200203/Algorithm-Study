import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // 로프 수
        int N = scan.nextInt();
        
        // 각로프가 버틸 수 있는 중량
        int[] arr = new int[N + 1];
        
        for(int i = 1; i <= N; i++){
            arr[i] = scan.nextInt();
        }
        
        Arrays.sort(arr);
        int max = arr[N];
        
        for(int i = 1; i < N; i++){
            max = Math.max(max, arr[i] * N - (i - 1));		
        } 
        
        System.out.println(max);
        
    }
}