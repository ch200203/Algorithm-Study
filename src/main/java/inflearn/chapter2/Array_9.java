package inflearn.chapter2;

public class Array_9 {
    public static void main(String[] args) {
        int n = 5;
        int[][] arr = {
            {10, 13, 10, 12, 15},
            {12, 39, 30, 23, 11},
            {11, 25, 50, 53, 15},
            {19, 27, 29, 37, 27},
            {19, 13, 30, 13, 19}
        };

        solution(n, arr);
    }

    public static void solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        // sum1 행의합, sum2 열의 합
        int sum1 = 0, sum2 = 0;
        
        // 행과 열의 합
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        
        // 대각선의 합
        sum1 = sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];
        }

        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        System.out.println(answer);
    }
}

