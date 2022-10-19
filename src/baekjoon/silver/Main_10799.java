import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_10799 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Stack<Character> stack = new Stack<>();

        int answer = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') {
                stack.push('(');
                continue;
            } else if(str.charAt(i) == ')'){
                stack.pop();
                if(str.charAt(i - 1) == '(') {
                    answer += stack.size();
                } else answer++;
            }
        }

        System.out.println(answer);
    }
}
