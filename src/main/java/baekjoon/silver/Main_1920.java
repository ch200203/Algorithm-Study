package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1920 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N  = Integer.parseInt(br.readLine());
        int [] arr1 = new int [N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int M  = Integer.parseInt(br.readLine());
        int [] arr2 = new int [M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr1); // <- 정렬을 해주는게 중요하다

        for (int i = 0; i < arr2.length; i++) {
            if(Arrays.binarySearch(arr1, arr2[i]) < 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }

    // 직저 이분탐색을 구현한 경우
    // 참고 : https://st-lab.tistory.com/261

    /**
     * @param arr 정렬 된 배열
     * @param key 찾으려는 값
     * @return key와 일치하는 배열의 인덱스
     */
    public static int _binarySearch(int[] arr, int key) {
        int lo = 0;                 // 탐색 범위의 왼쪽 끝 index
        int hi = arr.length - 1;    // 탐색 범위의 오른쪽 끝 index
        
        // lo가 hi 보다 커지기 전까지만 반복
        while(lo <= hi) {
            int mid = (lo + hi) / 2;    // 중간위치

            // key 값이 중간 위치의 값보다 작을 경우
            if(key < arr[mid]) {
                hi = mid - 1;
            }

            // key이 중간 위치의 값보다 ㅋ클 경우
            else if(key > arr[mid]) {
                lo = mid + 1;
            } 

            // key와 중간값이 같은 경우
            else {
                return mid;
            }
        }
        
        // 찾고자 하는 값이 존재하지 않을 경우
	    return -1;
    }
}
