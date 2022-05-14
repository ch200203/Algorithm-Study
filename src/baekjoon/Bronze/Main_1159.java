package baekjoon.Bronze;

import java.util.Arrays;
import java.io.*;

public class Main_1159 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char arr [] = new char [N];
        String rslt = "";

        for (int i = 0; i < N; i++) {
            arr[i] = (br.readLine()).charAt(0);
        }

        br.close();

        Arrays.sort(arr);
        
        
        for (int i = 0; i < (N -1); i++) {
            int cnt = 0;
            for (int j = (i + 1); j < N; j++) {
                if(arr[i] == arr[j] && arr[i] != '0') {
                    cnt++;
                    arr[j] = '0';
                }
            }

            if(cnt > 3) {
                rslt += arr[i];
            }
        }

        if(rslt.equals("")){
            System.out.println("PREDAJA"); // 기권
        } else {
            System.out.println(rslt);
        }

        
    }
}
