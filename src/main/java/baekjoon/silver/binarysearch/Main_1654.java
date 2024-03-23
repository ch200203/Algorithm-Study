package baekjoon.silver.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 랜선 자르기
 * https://www.acmicpc.net/problem/1654
 */
public class Main_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken()); // 이미 가지고 있는 랜선의 수
        int N = Integer.parseInt(st.nextToken()); // 필요한 랜선의 수
    }
}
