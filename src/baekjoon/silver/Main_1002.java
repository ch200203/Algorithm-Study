package baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 풀이과정 참고 https://st-lab.tistory.com/90
public class Main_1002 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());


            sb.append(solution(x1, y1, r1, x2, y2, r2)).append("\n");
        }

        System.out.print(sb);
    }

    // 접점의 개수를 구하는 함수
    private static int solution(int x1, int y1, int r1, int x2, int y2, int r2) {

        // 중점간의 거리의 제곱 (부동소수점 때문에 사용)
        int distancePow = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // 두 좌표가 같은 경우(= 두원이 내접하는 경우)
        if(x1 == x2 && y1 == y1 && r1 == r2) {
            return -1;
        }

        // 두원의 반지름 합보다 중점간의 길이가 긴 경우
        else if (distancePow > Math.pow(r1 + r2, 2)) {
            return 0;
        }

        // 원 안에 원이 있으나 내접하지 않는 경우
        else if(distancePow < Math.pow(r2 - r1, 2)) {
            return 0;
        }

        // 내접하는 경우
        else if (distancePow == Math.pow(r2 - r1,2)) {
            return 1;
        }

        // 외접하는 경우
        else if (distancePow == Math.pow(r2 + r1,2)) {
            return 1;
        }

        return 2;
    }

}
