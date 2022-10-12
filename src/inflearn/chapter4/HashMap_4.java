package inflearn.chapter4;

import java.util.HashMap;
import java.util.Scanner;


// Hash, Two_pointer, Sliding_window
public class HashMap_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        
        solution(str1, str2);
    }

    public static void solution(String s1, String s2) {
        int answer = 0, lt = 0, rt = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // 비교할 map
        for(char c :  s2.toCharArray()) 
            map2.put(c, map2.getOrDefault(c, 0) + 1);

        // 문자열의 길이
        int length = s2.length() - 1;

        // 초기값 미리 세팅
        for (int i = 0; i < length; i++)
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);

        // 슬라이딩 윈도우
        for (rt = length; rt < s1.length(); rt++) {
            map1.put(s1.charAt(rt), map1.getOrDefault(s1.charAt(rt), 0) + 1);
            if(map1.equals(map2)) answer++;
            map1.put(s1.charAt(lt), map1.get(s1.charAt(lt)) -1);
            if(map1.get(s1.charAt(lt)) == 0) map1.remove(s1.charAt(lt));
            lt++;
        }

        System.out.println(answer);
    }
}
