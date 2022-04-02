package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main_2908{
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        scan.close();

        a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
        b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());

        // StringTokenizer 사용방법
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // int A = Integer.parseInt(new StringBuilder().append(st.nextToken()).reverse().toString());
        // int B = Integer.parseInt(new StringBuilder().append(st.nextToken()).reverse().toString());
        // 아까 Scanner 을 사용했을 때는 int 타입으로 받았기 때문에 객체를 생성할 때 append() 메소드를 써야했지만 
        // 만약 넣어주려는 인자가 String 타입이면 append() 를 사용할 필요가 없다.


        
        System.out.println(a > b ? a : b);
    }
}