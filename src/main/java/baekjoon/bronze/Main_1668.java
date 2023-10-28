package baekjoon.bronze;

import java.util.*;

public class Main_1668 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            
        int N = scan.nextInt();
        int[] trophy = new int[N];

        int lmax = Integer.MIN_VALUE; // 최초값 세팅
        int rmax = Integer.MIN_VALUE; // 최초값 세팅
        int cnt1 = 1; int cnt2 = 1;
        
        for(int i = 0; i < N; i++){
            trophy[i] = scan.nextInt();
        }  

        // 1. 왼쪽에서 볼 때.
        for (int i = 0; i < trophy.length - 1; i++) {
           if(lmax < trophy[i]) {
               lmax = trophy[i];
           }

           if(lmax >= trophy[i + 1]) {
               continue;
           }
           cnt1++;
        }
        
        //  2. 오른쪽에서 볼 때.
        for(int i = N -1; i > 0; i--) {
            if(rmax < trophy[i]) {
                rmax = trophy[i];
            }

            if(rmax >= trophy[i - 1]) {
                continue;
            }
            cnt2++;
        }

        System.out.println(cnt1);
        System.out.println(cnt2);
    }
}
