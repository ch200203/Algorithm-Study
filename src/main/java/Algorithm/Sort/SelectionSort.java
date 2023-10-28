package Algorithm.Sort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int [] array = {7, 5, 9, 8, 0, 3, 1, 6, 2, 4, 8};
		
		int  tmp = 0;
		
		for (int i = 0; i < array.length; i++) {
			int min_index = i ; // 가장 작은 원소의 인덱스
			
			 for (int j = i + 1; j < array.length; j++) {
				if(array[min_index] > array[j]){
					min_index = j;
				
				} // if 1 end
				
				tmp = array[min_index];
				array[min_index] = array[i];
				array[i] = tmp;
			} // for 2 nd
			 System.out.println( i +  " 회차:: " +  Arrays.toString(array));
		} // for 1 eend
		
		
	
	}

}
