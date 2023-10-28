package This_Is_Coding_Test.Part02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// 상하좌우
// N x N 크기의 정사각형 공간에서 이동
// 정사각형 밖을 벗어나는 것은 불가능

// 공간의 크기를 나타내는 N
// 둘째 줄에는 이동할 계획이 담긴내용
// => 최종적으로 도착할 좌표를 구하여라

public class Impl_01 {
	public static void main(String[] args) throws IOException {
		int [] dx = {0, 0 ,-1, 1};
		int [] dy = {-1, 1, 0 , 0};
		
		String [] move = {"L", "R", "U", "D"};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		// String [] way = br.readLine().split(" ");
		String [] way = {"R", "R", "R", "U", "D", "D"};
		
		int x = 0;
		int y = 0;
		
		for (int i = 0; i < way.length; i++) {
			for (int j = 0; j < move.length; j++) {
				if(way[i] == move[j]) {
					
					int nx = x + dx[j];
					int ny = y + dy[j];
					
					
					// 공간을 벗어난 경우 실행하지 않음
					if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
					
					// 좌표이동 확정
                    x = nx;
                    y = ny;
				}
			}
		}
		
		System.out.println((x + 1) + " " + (y + 1));

	}// R R R U D D

}
