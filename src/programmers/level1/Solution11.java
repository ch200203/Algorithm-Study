package programmers.level1;


// https://programmers.co.kr/learn/courses/30/lessons/12934
// 정수 제곱근 판별
// 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
// n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴

public class Solution11 {
	public static void main(String[] args) {
		System.out.println(solution(3));
	}
	
	public static long solution(long n) {
		long answer = 0;
		
		// Math.sqrt()로 제곱근을 구할 수 있습니다. sqrt는 Square root를 의미하며 제곱근이라는 뜻입니다.
		
		Double double1 = Double.parseDouble(Long.toString(n));
		
		// System.out.println((int) Math.sqrt(n));
		
		int a = (int) Math.sqrt(n);
		
		if(a * a == n){
			a += 1;
			answer = a * a; 
		} else {
			answer = -1;
		}
		
		return answer;
		
		// https://codechacha.com/ko/java-math-pow/
		
		/*Double sqrt = Math.sqrt(n);
	      
	      if(sqrt == sqrt.intValue()){
	          return (long)Math.pow(sqrt + 1, 2);
	      } else return -1;*/
	}

}
