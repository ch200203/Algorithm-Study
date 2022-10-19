import java.util.Scanner;
import java.util.Stack;

public class Main_3986 {
    static int answer = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.next();
            solution(n, arr[i]);
        }

        System.out.println(answer);
        
    }

    private static void solution(int n, String str) {
        Stack<Character> stack = new Stack<>();

        // 홀수인 경우는 제외
        if(str.length() % 2 != 0) return;
        // 최초값 삽입
        stack.push(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if(!stack.isEmpty() && stack.peek() == str.charAt(i)) {
                stack.pop();
            } else {
                stack.push(str.charAt(i));
            }
        }

        if(stack.isEmpty()) answer++;
    }
}
