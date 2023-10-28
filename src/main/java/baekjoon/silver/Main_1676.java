package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main_1675 {
    public static void main(String[] agrs) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        
        while(num >= 5) {
            count += num /5 ;
            num /= 5;
        }

        System.out.println(count);
        
        br.close();
    }
}