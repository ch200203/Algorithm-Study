package Algorithm.Sort;


// 참고 : https://st-lab.tistory.com/104

public class CountSort {
	public static void main(String[] args) {
		int [] array = {7, 5, 9, 8, 0, 3, 1, 6, 2, 4, 8};
		
		int[] count = new int[array.length];
		
		
		for (int i = 0; i < count.length; i++) {
			count[i] = 0; // 전체 값 0으로 초기화
		}
		
		for (int i = 0; i < array.length; i++) {
			count[array[i]] ++ ;
		}
		
		for (int i = 0; i < count.length; i++) {
			if(count[i] != 0){
				for (int j = 0; j < count[i]; j++) {
					System.out.print(i +  " ");
				}
			}
		}
		
		
		
	}

}
