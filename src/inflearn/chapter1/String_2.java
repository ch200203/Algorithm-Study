package inflearn.chapter1;

public class String_2 {
    public static void main(String[] args) {
        String str = "StuDy";
       
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()) {
            // if(c >= 97 && c <= 122) {
            //     sb.append((char)c - 32);
            // } else {
            //     sb.append((char)c + 32);
            // }

            if(Character.isUpperCase(c)) {
                sb.append(String.valueOf(Character.toLowerCase(c)));
            } else {
                sb.append(String.valueOf(Character.toUpperCase(c)));
            }
        }

        return sb.toString();
    }
}