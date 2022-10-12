package inflearn.chapter4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        
        solution(str1, str2);
        System.out.println();
        System.out.println(solution_2(str1, str2));
    }

    public static void solution(String s1, String s2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char x : s1.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }

        for (char x : s2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        for (char key : map1.keySet()) {
            if(map1.get(key) != map2.get(key)) {
                System.out.println("NO");
                System.exit(0);
            } 
        }

        System.out.println("YES");
    }

    // 더 좋은 풀이 방법
    public static String solution_2(String s1, String s2) {
        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char x : s2.toCharArray()) {
            // 아나그램이 아닌 조건
            if(!map.containsKey(x) || map.get(x) == 0) return "NO";
            map.put(x, map.get(x) - 1);
        }

        return answer;
    }
}
