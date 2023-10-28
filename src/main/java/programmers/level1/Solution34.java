package programmers.level1;


/**
 * 둘만의 암호
 * https://school.programmers.co.kr/learn/courses/30/lessons/155652
 */
public class Solution34 {
    public static void main(String[] args) {
        String s = "z";
        String skip = "abcdefghij";
        int index = 20;
        
        System.out.println(solution(s, skip, index));
    }  

    private static String solution(String s, String skip, int index) {
        // 문자열 s의 각 알파벳을 index만큼 뒤의 알파벳으로 바꿔줍니다.
        // index만큼의 뒤의 알파벳이 z를 넘어갈 경우 다시 a로 돌아갑니다.
        // skip에 있는 알파벳은 제외하고 건너뜁니다.
        char[] words = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (Character c : words) {
            for(int i = 0; i < index; i++) {
                do {
                    c++;
                    if(c > 'z') c = 'a';
                } while(skip.contains(String.valueOf(c)));
            }
            sb.append(c);
        }

        return sb.toString();
    }
}
