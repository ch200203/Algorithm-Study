package inflearn.chapter1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine()));
    }

    public static String solution(String str) {
        StringTokenizer st = new StringTokenizer(str);
        String tmp = "";
        while(st.hasMoreTokens()) {
            String s = st.nextToken();
            if(s.length() > tmp.length()) {
                tmp = s;
            }
        }
        
        return tmp;
    }
}
