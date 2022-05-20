package programmers.level1;


// 최소직사각형
// https://programmers.co.kr/learn/courses/30/lessons/86491

public class Solution28 {
    public static void main(String[] args) {
        int [][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int ans = solution(sizes);
        System.out.println(ans);
    }

    public static int solution(int[][] sizes) {
        int answer = 0;

        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < sizes.length; i++) {
            int v = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);

            max1 = Math.max(max1, v);
            max2 = Math.max(max2, h);
        }

        return answer = max1 * max2;
    }
}
