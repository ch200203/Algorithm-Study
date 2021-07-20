package programmers.level2;

// N개의 최소공배수 (LCM)
// 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 
// 가장 작은 숫자가 됩니다. n개의 숫자를 담은 배열 arr이 입력되었을 때 
// 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.
// https://programmers.co.kr/learn/courses/30/lessons/12953



// 유클리드 호제법 읻용

public class Solution3 {
	public static void main(String[] args) {
		int [] arr = {2, 6 ,8 ,14};
		
		System.out.println("answer :: " + solution(arr));
		
		
	}
	
	public static int solution(int[] arr){
		int res = 0;
		
		 /*int lcm1 = arr[0];
	      for(int i=0;i<arr.length;i++) {
	    	  
	    		  lcm1 =lcm(lcm1,arr[i]);
	    	  
	      }
	      return lcm1;*/
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				res = lcm(arr[i], arr[j]);
			}
		}
		
		return 0;
	}
	
	static int gcd(int a, int b){
		while(b !=0 ){
			int r = a% b;
			a = b;
			b = r;
		}
		return a;
	}
	
	static int lcm(int a, int b){
		return a * b / gcd(a,b);
	}

}
