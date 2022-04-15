package baekjoon.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2775 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine());

		int apart [][] = new int [15][15];

		// 초기값 설정
		for (int i = 0; i <= 14; i++) {
			apart[i][1] = 1;
			apart[0][i] = i;
		}

		// 테스트 케이스만큼 반복
		for (int i = 0; i < caseNum; i++) {
			
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());

			// 층수 만큼 반복
			for (int j = 1; j <= k; j++) {
				for (int x = 2; x < n+1; x++) {
					apart[j][x] = apart[j-1][x] + apart[j][x-1];
				}
			}
			System.out.println(apart[k][n]);
		}
	}
}
