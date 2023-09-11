package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_16916 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String P = br.readLine();
        String S = br.readLine();

        int answer = P.contains(S) ? 1 : 0;

        System.out.println(answer);
    }
}
