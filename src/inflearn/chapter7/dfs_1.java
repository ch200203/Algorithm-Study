package inflearn.chapter7;

import java.util.Scanner;

/**
 * 합이 같은 부분 집합
 * N개의 원소로 구성된 자연수 집합이 주어지면, 이 집합을 두 개의 부분집합으로 나누었을 때
 * 두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 “YES"를 출력하고, 그렇지 않으면 ”NO"를 출력하는 프로그램을 작성하세요.
 * 
 */
public class dfs_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(solution(n, arr));
        
        scan.close();
    }

    private static String solution(int n, int[] arr) {
        return "YES";
        
    }
    
    private static int dfs() {

    }
}
