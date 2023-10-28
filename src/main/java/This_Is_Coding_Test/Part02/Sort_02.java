package This_Is_Coding_Test.Part02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

// 성적이 낮은 순서로 학생을 출력하기

public class Sort_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("N 입력 :: ");
		int n = Integer.parseInt(scan.nextLine());
		
		
		Map<String, Integer> map = new HashMap();
		
		for (int i = 0; i < n; i++) {
			String input = scan.nextLine();
			System.out.println(input);
			String key = input.split(" ")[0];
			Integer value = Integer.parseInt(input.split(" ")[1]);
			
			map.put(key, value);
		}
		
		
		// Map.entry 리스트 작성
		List<Entry<String, Integer>> list_entry = new ArrayList<Entry<String, Integer>>(map.entrySet());
		
		// Collections 를 사용해 내림차순 정렬
		Collections.sort(list_entry, new Comparator<Entry<String, Integer>>() {

			// compare로 값 비교
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// 내림차순으로 정렬
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		// 내림차순 정렬 결과3
		System.out.println(list_entry.toString());
		scan.close();

	}

}
