package baekjoon.Bronze;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main_1026 {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        int arrSzie = scan.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < arrSzie; i++) {
            a.add(scan.nextInt());
        }
        
        for (int i = 0; i < arrSzie; i++) {
            b.add(scan.nextInt());
        }

        a.sort(Comparator.naturalOrder());
        b.sort(Comparator.reverseOrder());

        for (int i = 0; i < arrSzie; i++) {
            int mult = a.get(i) * b.get(i);
            sum += mult;
        }

        System.out.println(sum);
        scan.close();
    }
}

