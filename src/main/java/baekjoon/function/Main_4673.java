package baekjoon.function;

// https://www.acmicpc.net/problem/4673
// 셀프 넘버
// 10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

public class Main_4673 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		boolean[] check = new boolean[10001];	// 1부터 10000이므로
		
		for (int i = 1; i <= 10000; i++) {
			int n = selfNumber(i);
			
			if(n < 10001){
				check[n]  = true;
			}
		}
		
		
		for (int i = 1; i <= 10000; i++) {
			if(!check[i]){
				sb.append(i).append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
	public static int selfNumber(int m){
		int sum = m;
		
		while ( m != 0) {
			sum = sum + (m  % 10); // 첫번째 자리수 
			m  = m / 10;
		}
		
		return sum;
	}

}
