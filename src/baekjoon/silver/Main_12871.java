package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_12871 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();

        if(s1.length() == s2.length())  {
            if(s1.equals(s2)) System.out.println(1);
            else System.out.println(0);
        } else {
            // 두 문자열의 길이가 다르면 길이의 최소 공배수를 구해서 
            // 두 문자열 모두 문자열을 반복하여 늘려 비교한다.
            int lcm = lcm(s1.length(), s2.length());

            StringBuilder sb1 = new StringBuilder(s1);
            StringBuilder sb2 = new StringBuilder(s2);

            for (int i = 0; i < lcm / s1.length() - 1; ++i) {
                sb1.append(s1);
            }

            for (int i = 0; i < lcm / s2.length() - 1; ++i) {
                sb2.append(s2);
            }

            if(sb1.toString().equals(sb2.toString())) System.out.println(1);
            else System.out.println(0);
        }


    }

    // 최소공배수
    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    // 최대 공약수
    private static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
