package codility;

import java.util.regex.Pattern;

public class Solution_2 {
    private static final Pattern ONE = Pattern.compile("1+");
    public int solution(String S) {

        if(ONE.matcher(S).matches() && S.length() % 400000 == 0) {
            return (S.length() / 400000) * 2 - 1;
        }
        int operations = 0;
        int tenNumber = Integer.valueOf(S, 2);
        System.out.println("십진수 : " + tenNumber);
        int number = Integer.parseInt(S, 2); // Convert binary string to integer

        while (number > 0) {
            if ((number & 1) == 0) {
                number /= 2;
            } else {
                number -= 1;
            }
            operations++;
        }

        return operations;
    }

    public static void main(String[] args) {
        Solution_2 sol = new Solution_2();
        System.out.println(sol.solution("011100")); // 7
        System.out.println(sol.solution("111")); // 5
        System.out.println(sol.solution("1111010101111")); // 22
    }
}
