package baekjoon;

import java.util.Scanner;

class Main_11047{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); // 동전의 갯수
        int k = scan.nextInt(); // 금액

        int coin [] = new int[n];

        for (int i = 0; i < n; i++) {
            coin[i] = scan.nextInt();
        }

        int count = 0;
        
        //  N개의 동전 중 가장 큰 가치를 지닌 동전부터 탐색하여 동전의 가치가 K보다 클 경우는 넘어가고, 
        // 아닐경우는 최대 구성 가능한 개수를 더해주면 된다. 
        // ==> Greedy Algorithm
        for (int i = n - 1; i >= 0 ; i--) {
            // 현재 동전의 가치가 K 보다 작거나 같아야지 구성가능 하다.
            if(coin[i] <= k) {
                // 현재 가치의 동전으로 구성할 수 있는 개수를 더해준다.
                count += (k / coin[i]);
                k = k % coin[i];    
            }
        }

        System.out.println(count);
    }
}