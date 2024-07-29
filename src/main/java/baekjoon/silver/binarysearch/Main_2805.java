package baekjoon.silver.binarysearch;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2805
public class Main_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 1. 입력받기
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 나무의 수
        int m = Integer.parseInt(st.nextToken()); // 가져가려는 나무의 높이

        // 2. 배열 입력받기
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        new Main_2805().solution(n, m, arr);
    }

    // 높이를 기준으로 탐색한다.
    private void solution(int n, int m, int[] arr) {
        // 이진 탐색을 사용하여 절단기의 높이를 찾기
        int maxTreeHeight = Arrays.stream(arr).max().getAsInt();
        int result = binarySearch(arr, m, 0, maxTreeHeight);

        System.out.println(result);
    }

    // 이진 탐색을 위한 재귀 함수
    private static int binarySearch(int[] trees, int M, int low, int high) {
        if (low > high) {
            return high;
        }

        int mid = low + (high - low) / 2;
        long totalWood = getTotalWood(trees, mid);

        if (totalWood >= M) {
            return binarySearch(trees, M, mid + 1, high); // 더 높은 높이를 찾아봄
        } else {
            return binarySearch(trees, M, low, mid - 1); // 더 낮은 높이를 찾아봄
        }
    }

    // 주어진 높이에서 얻을 수 있는 나무의 총 길이를 계산하는 함수
    private static long getTotalWood(int[] trees, int height) {
        long total = 0;
        for (int tree : trees) {
            if (tree > height) {
                total += tree - height;
            }
        }
        return total;
    }
}
