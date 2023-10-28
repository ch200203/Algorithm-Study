package programmers.level2.Exhaustive_Search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

// 완전 탐색
// 1. 소수 찾기
// https://programmers.co.kr/learn/courses/30/lessons/42839

public class Solution1 {
	public static TreeSet<Integer> set = new TreeSet<>(); // 중복값을 제거하기 위해 set 사용
	
	public static void main(String[] args) {
		String numbers = "17";
		System.out.println("answer :: " + solution(numbers));
	}
	
	public static int solution(String numbers){
		int len = numbers.length();
		
		// String 배열로 숫자 하나씩 담기
		String [] str = new String [len];
		
		for (int i = 0; i < str.length; i++) {
			str[i] = Character.toString(numbers.charAt(i));
		} 
		
		boolean [] visited = new boolean[len];
		Arrays.fill(visited, false); //배열에 false 디폴트로 담아주기
		
		// 1개 부터 배열의 갯수만큼 순열 만들기
		for (int i = 0; i < len; i++) {
			permutation_dfs(str, visited, "", i+1, 0);
		}
		
		
		return set == null ? 0 : set.size();
	}

/**
 *  dfs를 이용하여 순열 만들기
 *
 *  @param arr : 숫자가 담긴 String 배열
 *  @param visited : 방문여부 판단
 *  @param str : 소수 판단할 수
 *  @param r : 순열을 만들 갯수
 *  @param depth : 순열 개수 체크
 * */
	private static void permutation_dfs(String[] arr, boolean[] visited, String str, int r, int depth) {
		if(depth == r){
			int n = Integer.parseInt(str);
			
			// 소수 이면서 set 에 없는 숫자만 담기
			if(isPrime(n) && !set.contains(n)){
				System.out.println( " n :: " + n);
				set.add(n);
			}
			
			return;
		}
		
		for (int i = 0; i < arr.length; i++) {
			// 방문하지 않은 경우
			if(!visited[i]){
				visited[i] = true;
				str += arr[i];
				
				System.out.println("str : " + str  + " |  arr[" + i + "] :" + arr[i]);
				permutation_dfs(arr, visited, str, r, depth + 1);
				// 현재 숫자 말고 다른 숫자를 선택 하는 경우 str에서 위에서 방문한 숫자 지워주기
				str = str.substring(0, str.length() -1);
				visited[i] = false;
			}
		}
	}
	
	public static boolean isPrime(int n) {
		if(n <= 1){
			// 0 과 1은 소수가 아님
			return false;
		}
		
		if(n == 2 || n == 3){
			return true;
		}
		
		// 제곱근까지 나누면서 나눠지는지 체크
		for (int i = 2; i <(int) Math.sqrt(n); i++) {
			if(n % i == 0){
				return false;
			}
		}
		
		return true;
	}

}
	