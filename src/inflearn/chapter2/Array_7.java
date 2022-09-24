package inflearn.chapter2;

public class Array_7 {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {1, 0 ,1, 1, 1, 0, 0, 1, 1, 0};
        solution(n, arr);
    }

    public static void solution(int n, int[] arr) {
        int answer = 0;
        int tmp = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                tmp++;
                answer += tmp;
            } else {
                tmp = 0;
            }
        }

        System.out.println(answer);
    }
}
