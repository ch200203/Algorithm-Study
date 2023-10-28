package inflearn.chapter4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;


// TreeSet : 오름 차수 정렬
public class HashMap_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        solution(n, k, arr);

        scan.close();
    }

    public static void solution(int n, int k, int[] arr) {
        // 내림차순 정렬
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        // 3장 뽑아내기
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        // TreeSet Method
        // 제거 Tset.remove(143);
        // 원소의 갯수 Tset.size(); 
        // 정렬했을때 가장 앞에 있는 값 Tset.first();
        // 정렬했을때 가장 뒤에 있는 값 Tset.last();
        int cnt = 0;
        for (int x : Tset) {
            

            cnt++;
            if(cnt == k) answer = x;
        }

        System.out.println(answer);
    }
}
