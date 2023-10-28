package This_Is_Coding_Test.Part02;

import java.util.Arrays;
import java.util.Collections;

// 두배열의 원소교체

public class Sort_03 {
	public static void main(String[] args) {
		int n = 5;
		int k = 3;
		
		int sum = 0;
	
		Integer [] arrA = {1,2,5,4,3};
		Integer [] arrB = {5,5,6,6,5};
		
		
		
		// A는 오름 차순 B는 내림차순 정렬
		Arrays.sort(arrA);
		Arrays.sort(arrB, Collections.reverseOrder());
		System.out.println("arrA :: " + Arrays.toString(arrA));
		System.out.println("arrA :: " + Arrays.toString(arrB));
		
		for (int i = 0; i < k; i++) {
			int tmp = 0;
			if(arrA[i] < arrB[i]){
				System.out.println(arrA[i]  + " 와 " + arrB[i] +  "를 바꿔준다.");
				tmp = arrA[i];
				arrA[i] = arrB[i];
				arrB[i] = tmp;
			}
		}
		
		
		for (int i = 0; i < arrA.length; i++) {
			sum += arrA[i];
		}
		
		System.out.println(sum);
		
		
	}

}


