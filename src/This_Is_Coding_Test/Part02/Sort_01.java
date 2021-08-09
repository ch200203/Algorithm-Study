package This_Is_Coding_Test.Part02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// part02_sort 1번문제
// 위에서 아래로
// 주어진 숫자를 내림차순으로 정렬

public class Sort_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		Integer [] arr = new Integer [n];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "번째 수 입력 :: ");
			arr[i] = scan.nextInt(); 
		}
		
		scan.close();
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(arr));
		
	
	}

}
