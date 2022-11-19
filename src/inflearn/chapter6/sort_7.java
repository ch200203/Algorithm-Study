package inflearn.chapter6;

import java.util.Arrays;
import java.util.Scanner;



public class sort_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] arr = new int [n];

        for(int i = 0; i < n; i++) arr[i] = scan.nextInt();

        solution(n, m, arr);

        scan.close();
    }

    /**
     * 결정 알고리즘
     * 이분 탐색 이용
     * stream => '이것이 자바다' 책 읽어볼것
     */
    private static void solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt(); // stream.max or min => optionalInt 이기 때문에 getAsInt로 바꾸어주어야함.        
        int rt = Arrays.stream(arr).sum(); 

        while(lt <= rt) {
            int mid = (lt + rt) / 2;

            if(count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            }
            else lt = mid + 1;
            
        }


        System.out.println(answer);
    }

    private static int count(int[] arr, int capacity) {
        // cnt : dvd의 장수
        // sum : 합
        int cnt = 1, sum = 0;

        for(int x : arr) {
            if(sum + x > capacity) {
                cnt++;
                sum = x;
            } 
            else sum += x;
        }
        
        return cnt;
    }
}
