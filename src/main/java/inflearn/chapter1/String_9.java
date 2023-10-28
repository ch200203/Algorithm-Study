package inflearn.chapter1;

import java.util.Scanner;

public class String_9 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println(Integer.parseInt(soluition(scan.nextLine())));
    }

    public static String soluition(String str) {
        str = str.toUpperCase();       
        // String ans = "";
        // for(char c : str.toCharArray()) {
        //     if(Character.isDigit(c)) ans += c;
        // }
        return str.replaceAll("[^0-9]", "");
    }
}
