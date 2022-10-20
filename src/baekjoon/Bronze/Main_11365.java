package baekjoon.Bronze;

import java.util.*;
public class Main_11365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String getStr = sc.nextLine();
            if(getStr.equals("END")) break;
            else System.out.println(new StringBuffer(getStr).reverse().toString());
        }
    }    
}