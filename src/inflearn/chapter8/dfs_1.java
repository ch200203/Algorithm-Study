package inflearn.chapter8;

import java.util.Scanner;

/*
 * N개의 원소로 구성된 자연수 집합이 주어지면, 이 집합을 두 개의 부분집합으로 나누었을 때
 * 두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 “YES"를 출력하고, 그렇지 않으면 ”NO"를 출력하는 프로그램을 작성하세요.
 * 둘로 나뉘는 두 부분집합은 서로소 집합이며, 두 부분집합을 합하면 입력으로 주어진 원래의 집합이 되어 합니다.
 * 예를 들어 {1, 3, 5, 6, 7, 10}이 입력되면 {1, 3, 5, 7} = {6, 10} 으로 두 부분집합의 합이 16으로 같은 경우가 존재하는 것을 알 수 있다.
 * 
 */
public class dfs_1 {
    static String answer = "NO";
    static int n = 0, total = 0;
    static boolean flag = false;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            total += arr[i];
        };

        dfs(0 , 0, arr);
        
        System.out.print(answer);

        scan.close();
    }

    private static void dfs(int level, int sum, int[] arr) {
        if(flag) return;
        if(level == n) {
            if((total - sum) == sum) {
                answer = "YES";
                flag = true; // 두 부분집합을 찾은 경우
            }
        } else {
            dfs(level + 1, sum + arr[level], arr); /// 해당하는 level의 원소를 사용하는 경우
            dfs(level + 1, sum, arr); // 사용하지 않는 경우
            // => 두가지로 나누어 부분집합을 생성합니다.
        }
    }
    
}
