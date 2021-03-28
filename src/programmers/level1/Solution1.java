package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Solution1 {
    public static void main(String[] args) {
    	int arr [] = {5, 9, 7, 10};
    	int divisor = 5;
    	
    	Solution1 sol1 = new Solution1();
    	int [] ans = sol1.solution(arr, divisor);
    	
    	System.out.println(Arrays.toString(ans));
    
           
    }

    public int[] solution(int[] arr,  int divisor){
        ArrayList<Integer> alist = new  ArrayList<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				alist.add(arr[i]);
			}
		}
        if(alist.size() < 1) {
        	alist.add(-1);
        }
        
        Collections.sort(alist);
        int [] ans = new int [alist.size()];
        int cnt = 0;
        for(Integer i : alist){
            ans[cnt] = i;
            cnt ++;
        }
        
        return ans;
    }

}


// [5, 9, 7, 10]	5	[5, 10]
