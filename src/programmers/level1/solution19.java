package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class solution19 {
	public static void main(String[] args) {
		
	}
	
	public static int solution19(int [] numbers){
		int sum  = 45;
		
		for (int i = 0; i < numbers.length; i++) {
			sum -= numbers[i];
		}
		
		
		return sum;
	}
	
	public static int solution19_1(int[] numbers){
		int answer = 0;
		boolean [] arr = new boolean[10];
		
		for (int i = 0; i < numbers.length; i++) {
			arr[numbers[i]] = true;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(!arr[i]) answer += i;
		}
		
		return answer;
	}

}
