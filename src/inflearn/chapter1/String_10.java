package inflearn.chapter1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class String_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scan.nextLine());
        String str = st.nextToken();
        String t = st.nextToken();

        for (int i : soluition(str, t)) {
            System.out.print(i + " ");
        }

        scan.close();
    }

    public static int[] soluition(String str, String t) {
        int[] answer = new int[str.length()];
        int p = 1001;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == t.charAt(0)) {
                p = 0;
                answer[i] = p;
            } else {
                // 왼쪽으로부터 떨어진 거리
                p++;
                answer[i] = p;
            }
        }
        p = 1001;
        for (int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == t.charAt(0)) {
                p = 0;
            } else {
                // 오른 쪽 으로부터 떨어진 거리
                p++;
                answer[i] = Math.min(answer[i], p); // 왼쪽, 오른쪽 둘중 작은쪽의 값을 넣어줌
            }
        }

        return answer;
    }
}