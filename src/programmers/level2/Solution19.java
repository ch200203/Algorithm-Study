package programmers.level2;

/**
 * 프로그래머스 : Jaden Case 문자열 만들기
 * https://techhan.github.io/algorithm/programmers-45/
 */
public class Solution19 {
    public static void main(String[] args) {
        String s =  "a aa";
        System.out.println(solution(s));
    }

    private static String solution(String s ) {
        StringBuilder sb = new StringBuilder();
        
        s = s.toLowerCase();
        sb.append(Character.toUpperCase(s.charAt(0)));

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == ' ') sb.append(" ");
            else if (s.charAt(i - 1) == ' ') 
                sb.append(Character.toUpperCase(s.charAt(i)));
            else sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
