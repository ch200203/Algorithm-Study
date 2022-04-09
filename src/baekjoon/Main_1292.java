package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main_1292 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        ArrayList<Integer> list = new ArrayList<>();

        int a = Integer.parseInt(st.nextToken()) ;
        int b = Integer.parseInt(st.nextToken());
        
        for (int i = 1; i <= b; i++) {
            for (int j = 0; j < i; j++) {
                list.add(i);    
            }
        }
    
        int sum = 0;
        for (int i = a - 1; i <= b -1; i++) {
            sum += list.get(i);
        }

        System.out.println(sum);
    }
}