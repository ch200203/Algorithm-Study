package programmers.level1;


// 부족한 금액 계산하기
//https://programmers.co.kr/learn/courses/30/lessons/82612

public class solution25 {
	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
				
		System.out.println(solution(price, money, count)); 
	}
	
	public static long solution(int price, int money, int count) {
        long need = 0;
        long result = 0;
        
        for (int i = 0; i < count; i++) {
        	need += price * (i + 1);
		}
        
        if(need - money >= 0 ){
        	return result = need - money;
        }
        
        return 0; 
    }
}
