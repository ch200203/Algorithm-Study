package programmers.level1;


// 하샤드 수
// 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다
// https://programmers.co.kr/learn/courses/30/lessons/12947

public class Solution5 {
    public static void main(String[] args) {
    	int x = 11;
    
    	System.out.println(Solution5.solution(x));
           
    }
    
    public static boolean solution(int x) {
        boolean answer = true;
       	char[] arr = new char[String.valueOf(x).length()];
       	arr = String.valueOf(x).toCharArray();
       	
       	int div = 0;
       	
       	for (int i = 0; i < arr.length; i++) {
			div += Integer.parseInt(String.valueOf(arr[i]));
		}
       	
       	answer = x % div == 0 ? (answer = true) : (answer = false);

        return answer;
    }
}
