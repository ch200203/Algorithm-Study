package baekjoon.silver;

import java.util.Scanner;


// 백트래킹 + 소수알고리즘
public class Main_2960 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        System.out.println(solution(n, m));

        scan.close();
    }

    private static int solution(int n, int m) {
        boolean[] prime = new boolean[n + 1];

        for(int i = 2; i <= n; i++) {
            // if(prime[i]) continue;
            for (int j = i; j <= n; j+= i) {
                if(prime[j] == false) {
                    m--;
                    prime[j] = true;
                }

                if(m == 0) return j;
            }
        }

        return -1;
    }
}
