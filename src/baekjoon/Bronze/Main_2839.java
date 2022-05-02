package baekjoon.Bronze;

import java.util.Scanner;

public class Main_2839 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int ans = 0;

        /* 
        문제를 경우의 수로 분할하여 품
        =>
        1. n 이 4 또는 7 인 경우
        2. n 이 5의 배수인경우 ( 5로 나눈 나머지가 0 인 경우 )
        3. n 이 5의 배수 + 1 또는 5의 배수 + 3 인 경우 ( 5로 나눈 나머지가 1 또는 3 인 경우 )
        4. n 이 5의 배수 + 2 또는 5의 배수 + 4 인 경우 ( 5로 나눈 나머지가 2 또는 4 인 경우 )
        */
        if(N == 4 || N == 7) {
            ans = -1;
        } else if(N % 5 == 0) {
            ans = N / 5;
        } else if( N % 5 == 1|| N % 5 == 3 ){
            ans = N / 5 + 1;
        } else if(N % 5 == 2 || N % 5 == 4) {
            ans = N / 5 + 2;
        }
        // 골드바흐의 추측
        // "두 소수의 합으로 표현 가능한 모든 정수는, 모든 항이 1이 될 때까지 원하는 만큼 얼마든지 많은 개수의 소수의 합으로 분해할 수 있다."

        // 풀이참고 https://st-lab.tistory.com/72


        System.out.println(ans);
        
    }
    
}
