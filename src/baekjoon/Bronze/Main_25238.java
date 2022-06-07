package baekjoon.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_25238 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());
        
        double def = a -  (a * (b / 100));
        System.out.println(def);
        if(def >= 100) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}