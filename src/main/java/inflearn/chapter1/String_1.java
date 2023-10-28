package inflearn.chapter1;

import java.util.Scanner;

public class String_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char c = scan.nextLine().charAt(0);

        System.out.println(solution(str, c));
    }

    public static int solution(String str, char c) {
        int answer = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        // str => char 배열로 변환
        for(char x : str.toCharArray()) {
            if(x == c) answer++;
        }
        return answer;
    }
}
