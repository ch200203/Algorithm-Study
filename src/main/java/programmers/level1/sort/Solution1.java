package programmers.level1.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


/*
	프로그래머스 Level_1 정렬 _K번째 수
	배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
	https://programmers.co.kr/learn/courses/30/lessons/42748?language=java
*/
public class Solution1 {
	public static void main(String[] args) {
		int [] arr = {1, 5, 2, 6, 3, 7, 4};
		int [][] comm = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		
		System.out.println(Arrays.toString(Solution1.Solution(arr, comm)));
		
	}
	
	public static int[] Solution(int[] arr, int [][] comm){
		int [] answer = new int[comm.length];
		int a, b, c;
		
		
		for (int i = 0; i < comm.length; i++) {
			a = comm[i][0]-1;
			b = comm[i][1];
			c = comm[i][2]-1;
			int[] arr2 = Arrays.copyOfRange(arr, a, b); // 해당 범위만큼의 배열을 복사
			Arrays.sort(arr2);
			answer[i] = arr2[c]; 
		}
			
		return answer;
	}

}
