package inflearn.chapter4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class HashMap_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();

        solution(n, str);

        scan.close();
    }
    
    public static void solution(int N, String str) {
        int max = Integer.MIN_VALUE;
        char answer = ' ';
        Map<Character, Integer> map = new HashMap<>();

        for (char x : str.toCharArray()) {
            // x : key, getOrDefault => x의 key 가 없다면 default 값 설정!
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char key : map.keySet()) {
            if(map.get(key) > max ) {
                max = map.get(key);
                answer = key;
            }
        }
        System.out.println(answer);

        // 해당 키가 있는지 확인 하는 메소드 retrun boolean
        // System.out.println(map.containsKey('A'));
        // map의 길이
        // System.out.println(map.size());
        // 특정 key 삭제
        // System.out.println(map.remove('A'));
        
    }
}
