package baekjoon.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_4153 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			StringTokenizer st = new StringTokenizer(br.readLine());
			Double [] doubles = new Double [3];
			for (int i = 0; i < doubles.length; i++) {
				doubles[i] = Double.parseDouble(st.nextToken());
			}
			Arrays.sort(doubles, Collections.reverseOrder());

			if(doubles[0] == 0 && doubles[1] == 0 && doubles[2] == 0) System.exit(0);
			
			String result = Math.pow(doubles[0], 2) == (Math.pow(doubles[1], 2) + Math.pow(doubles[2], 2)) ?
				"right" : "wrong";

			System.out.println(result);
		}
	}
}