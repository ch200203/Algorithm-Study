package Algorithm.Graph;

import java.util.Arrays;

public class Insertion_Sort {
	public static void main(String[] args) {
		int [] array = {7, 5, 9, 8, 0, 3, 1, 6, 2, 4, 8};
		
		int tmp = 0;
		
		int j = 0;
		
		for (int i = 0; i < array.length; i++) {
			tmp = array[i];
			for (j = i -1 ; j >= 0 && tmp < array[j]; j--) { // 감소하는것이 핵심
				
				array[j + 1] = array[j];
			}
			
			array[j + 1] = tmp;
		}
		
		System.out.println(Arrays.toString(array));

		
	}

}
