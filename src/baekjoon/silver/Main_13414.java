package baekjoon.silver;

import java.util.*;

public class Main_13414 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        // 수강 가능인원
        int k = scan.nextInt();
        // 대기열의 길이
        int l = scan.nextInt();
        
        String[] students = new String[l];
        
        for (int i = 0; i < l; i++) students[i] = scan.next();
        
        solution(k, l, students);

    }


    // 순열을 보장하는 LinkedHashSet 을 써볼것....
    public static void solution(int k, int l, String[] students) {
        LinkedHashSet<String> Lset = new LinkedHashSet<>();
        // map 이나 set은 순서가 보장 되지않음.. => LinkedHashSet 사용

        for (int i = 0; i < l; i++) {
            // 중복으로 신청한경우 리스트에서 제거
            if(Lset.contains(students[i])) Lset.remove(students[i]);
            // 리스트의 맨뒤로 다시 집어 넣음.
            Lset.add(students[i]); 
        }

        int count = 0;
        for (String str : Lset) {
            count++;
            System.out.println(str);
            if(count == k) break;
        }

    }

}
