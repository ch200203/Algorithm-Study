package inflearn.chapter1;

public class String_11 {
    public static void main(String[] args) {
        String str = "KKHSSSSSSSE";
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        str += " ";
        int cnt = 1;

        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                sb.append(str.charAt(i));
                if(cnt > 1) sb.append(String.valueOf(cnt));
                cnt = 1;
            }
        }
        return sb.toString();
    }
}
