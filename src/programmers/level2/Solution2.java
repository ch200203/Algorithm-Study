package programmers.level2;


// 행렬의 곱셈
// https://programmers.co.kr/learn/courses/30/lessons/12949
// 2차원 행렬 arr1과 arr2를 입력받아,
// 	arr1에 arr2를 곱한 결과를 반환하는 함수, solution을 완성해주세요.

public class Solution2 {
	public static void main(String[] args) {
		
	}
	
	public static int[][] solution(int[][] arr1, int[][] arr2){
		int[][] answer = new int [arr1.length][arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				for (int k = 0; k < arr1[0].length; k++) {
					answer[i][j] += (arr1[i][k] * arr2[j][k]);
				}
			}
		}
		return answer;
	}

}
