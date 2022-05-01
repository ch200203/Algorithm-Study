package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1459 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long X = Long.parseLong(st.nextToken()); // ~10억
        long Y = Long.parseLong(st.nextToken()); // ~10억
        long W = Long.parseLong(st.nextToken()); // 수평 ~10,000
        long S = Long.parseLong(st.nextToken()); // 대각선 ~10.000

        long move1, move2, move3;

        // 1. 수평으로만 이동(가로 + 세로)
        move1 = (X + Y) * W;
        
        
        // 2. 대각선으로만 이동하는 경우
        // 2-1. 홀수일 경우 대각선 이동 후 수평이동 1칸
        // 2-2. 짝수일 경우 대각선으로만 이동 가능

        // 2-1. x + y 가 짝수라면
        if((X+Y) % 2 == 0) {
            move2 = Math.max(X, Y) * S;
        } else { // 2-2 x + y가 홀수면
            move2 = (Math.max(X, Y) - 1) * 2 + W;
        }

        // 3. 대각선 + 수평 : 대각선으로 최대한 이동 후 수평이동
        move3 = (Math.min(X, Y) * S) + (Math.abs(X - Y) * W);


        long ans = Math.min(Math.min(move1, move2), move3);
        System.out.println(ans);
    }
    
    public static void Solution() throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        long x=Long.parseLong(st.nextToken());
        long y=Long.parseLong(st.nextToken());
        long w=Long.parseLong(st.nextToken());
        long s=Long.parseLong(st.nextToken());
        
        long cost1, cost2, cost3;
        
        //1. 수평으로만 이동하는 경우
        cost1=(x+y)*w;
        
        //2. 대각선으로만 이동하는 경우
        //2.1 짝수일 경우 대각선으로만 이동 가능
        //2.2 홀수일 경우 대각선 이동 후 수평이동 한칸
        if((x+y)%2==0) cost2=Math.max(x, y)*s;
        else cost2=(Math.max(x, y)-1)*s+w;
        
        //3.대각선 + 수평 : 대각선으로 최대한 이동 후 수평 이동
        cost3=(Math.min(x, y))*s+(Math.abs(x-y))*w;
        
        System.out.println(Math.min(cost1, Math.min(cost2, cost3)));
        }
}



