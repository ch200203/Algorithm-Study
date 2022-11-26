package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main_1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 듣도 못한 사람
        HashSet<String> not_listen = new HashSet<>();
        // 듣보잡의 수
        TreeSet<String> dbj = new TreeSet<>();

        for(int i = 0; i < n; i++) {
            not_listen.add(br.readLine());    
        }

        for(int i = 0; i < m; i++) {
            String not_see = br.readLine();
            if(not_listen.contains(not_see)) 
                dbj.add(not_see);
        }
        
        System.out.println(dbj.size());
        for(String person : dbj) System.out.println(person);
    }
}