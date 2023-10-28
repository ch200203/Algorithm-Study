package This_Is_Coding_Test.Part02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 이것이 코딩테스트다 Greedy
// 숫자카드게임
// N x M 형태의 카드가 놓여있을때
// 뽑고자 하는 행을 선택하고 그 다음에는 숫자가 가장 낮은 카드를 뽑는다
// 그 카드들 중에서 가장 큰 수를 뽑는다.


public class Greedy_02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		 int row = Integer.parseInt(st.nextToken());
		 
	     String[] minArr = new String[row]; 
	   
	     
	     
	     for (int i = 0; i < row; i++) {
			String str = br.readLine();
			String [] arr = str.split(" ");
			
			Arrays.sort(arr);
			
			minArr[i] = arr[0];
		}
	     
	     Arrays.sort(minArr);
	     
	     System.out.println(minArr[row - 1]);
		
	}
}
