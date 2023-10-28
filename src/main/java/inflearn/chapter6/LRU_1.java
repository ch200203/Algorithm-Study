package inflearn.chapter6;

import java.util.Scanner;

/*
 * Least Recently Used
 * => 캐시 알고리즘으로 많이 사용됨
 */
public class LRU_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i : solution(s, n, arr)) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int size, int n , int[] arr) {
        int[] cache = new int[size];

        for(int x : arr) {
            // 포인터의 위치
            int pos = -1;
            for (int i = 0; i < cache.length; i++) {
                // HIT(캐시 메모리에 중복된 작업이 있는 경우)
                // 인덱스에 해당위치를 저장함
                if(x == cache[i]) pos = i;
                
            }
            // MISS(캐시 메모리에 중복된 작업이 없는 경우)
            if(pos == -1) {
                for (int i = size - 1; i >= 1; i--) {
                    // 한칸씩 뒤로 땡겨줌
                    cache[i] = cache[i - 1];
                }
            } else {
                for (int i = pos; i >= 1; i--) {
                    // 한칸씩 뒤로 땡겨줌
                    cache[i] = cache[i - 1];
                }
            }

            // 작업을 0번에 삽입
            cache[0] = x;
        }

        return cache;
    }
}
