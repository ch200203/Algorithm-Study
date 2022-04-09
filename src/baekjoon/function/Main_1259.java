package baekjoon.function;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1259 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String exit = "";
        while(true){
            String str = br.readLine();

            if(str.equals("0")) System.exit(0);
            
            // 문자열 반전
            String reverse = "";

            for (int i = str.length() -1; i >=0 ; i--) {
                reverse = reverse + str.charAt(i);
            }
            
            String yesorno = "yes";
            if(!str.equals(reverse)) yesorno = "no";

            System.out.println(yesorno);
        }
        
    }
}
