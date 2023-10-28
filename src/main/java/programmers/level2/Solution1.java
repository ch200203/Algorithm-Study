package programmers.level2;



// 피보나치 수열
// https://programmers.co.kr/learn/courses/30/lessons/12945
// 피보나치 수는 F(0) = 0, F(1) = 1일 때, 
// 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.

public class Solution1 {
	public static void main(String[] args) {
		System.out.println(solution(5));
	}
	
	
	public static int solution(int n){
		int answer = 0;
        //n이 3일때
        //f(3) = f(1)+f(2) = 1+1 = 2이므로 숫자 초기화
        int num1 = 1;
        int num2 = 1;
        
        if(n==1 || n==2) return 1;
        else {
            for(int i=3; i<=n; i++) {
                answer = (num1+num2)%1234567;
                num1 = num2;//전전수
                num2 = answer;//전수
                
            }
            return answer;
        }
	}

}
