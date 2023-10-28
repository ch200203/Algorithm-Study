package inflearn.chapter1;

import java.util.Scanner;

public class String_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer = null;
        str = str.toLowerCase();
        String restr = new StringBuilder(str).reverse().toString();

        return str.equalsIgnoreCase(restr) ? "YES" : "NO";
    }
}
