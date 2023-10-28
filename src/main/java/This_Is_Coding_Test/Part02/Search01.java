package This_Is_Coding_Test.Part02;

import java.util.Arrays;


// 부품 찾기

public class Search01 {
	public static void main(String[] args) {
		int n = 5;
		String str = "8 3 7 9 2";
		
		int m = 5;
		String str2 = "5 7 9";
		
		int [] inStore = new int[n];
		int [] want = new int[m];
		String [] answer = new String[m];
		
		for (int i = 0; i < n; i++) {
			inStore[i] = Integer.parseInt(str.split(" ")[i]); 
		}
		
		for (int i = 0; i < m; i++) {
			want[i] = Integer.parseInt(str2.split(" ")[i]); 
		}
		
		Arrays.sort(inStore);
		Arrays.fill(answer, "no");
		
		for (int w : want) {
			if(Arrays.binarySearch(inStore, w) > 0){
				System.out.println("yes");
			}
		}
		

	}

}
