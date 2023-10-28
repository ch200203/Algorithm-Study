package This_Is_Coding_Test.Part02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 왕실의 나이트

public class Impl_03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("좌표를 입력하세요 : ");
		
		
		// 행과 열 입력 받기
		String input = br.readLine();
		
		int row = input.charAt(1) - '0';
		int col = input.charAt(0) - 'a' + 1;
		
		int [] x = {-2, -1, 1, 2, 2, 1, -1, -2};
		int [] y = {-1, -2, -2, -1, 1, 2, 2, 1};
		
		
		int cnt = 0;
		
		for (int i = 0; i < x.length; i++) {
			int nextR = row + x[i];
			int nextC = row + y[i];
			
			if(nextR >= 1 && nextC <=8 && nextR <= 8 && nextC >= 1) cnt++;
			
		}
		
		System.out.println(cnt);
		
		
		
		
		
		
	}

}
