package inflearn.chapter1;

import java.util.ArrayList;
import java.util.Scanner;

public class String_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] str = new String[N];
    
        for(int i = 0; i < N; i++){
            str[i] = scan.next();
        }

        for(String x : solution(str, N)) {
            System.out.println(x);
        }
        
    }

    // 직접 뒤집는 알고리즘 구현
    public static ArrayList<String> solution(String[] str, int n) {
        ArrayList<String> answer=new ArrayList<>(); 
        for(String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;
            while (lt < rt) {
                char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }


    // String Builder 사용방법
    public static ArrayList<String> solution2(String[] str, int n) {
        ArrayList<String> answer = new ArrayList<String>();
        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }
}
