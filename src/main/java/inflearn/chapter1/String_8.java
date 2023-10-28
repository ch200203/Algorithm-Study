package inflearn.chapter1;

import java.util.Scanner;

public class String_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(solution(scan.nextLine()));
    }

    public static String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
    
        return answer = str.equalsIgnoreCase(tmp) ? "YES" : "NO";
    }
}
