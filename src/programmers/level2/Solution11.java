package programmers.level2;

import java.util.stream.IntStream;

// 예산
// https://programmers.co.kr/learn/courses/10302/lessons/62949

public class Solution11 {
    public static void main(String[] args) {
        
    }

    public static int soltion(int[] budgets,int M){
        // 이분탐색 적용
        // 최솟값과 최댓값 사이에 있는 값을 찾아야함.
        // 단, 데이터가 정렬되어 있어야함.
        int min = 0;
        int max = 0;
        // max 값 세팅
        for(int b : budgets){
            if(b > max) max = b;
        }

        int answer = 0;
        // 이분탐색 로직 적용.
        while(min <= max) {
            int mid = (min + max) / 2;
            int sum = 0;

            for(int b : budgets) {
                // 중간값이 예산보다 작을경우 상한가액으로 채택하여 대신 더해준다.
                if(b > mid) sum += mid;
                else sum += b;
            }

            if(sum <= M) {
                // 모두 더한 값이 전체 예산을 넘지 않는 경우
                // 정답으로 채택.
                min = mid + 1;
                answer = mid;
            } else {
                // 그렇지 않을 경우 범위를 좁혀 다시 이분탐색.
                max = mid - 1;
            }
        }

        return answer;
    }

    // 간결하게 변경
    public int soltion2(int [] budgets, int M){
        int min = 0;
        int max = IntStream.of(budgets).max().orElse(0); // OptionalInt => 값이 있을 수도 있고 없을 수도 있음

        int answer = 0;
        while (min <= max) {
            // Stream 안의 변수는 가변변수 사용하면 안됨
            final int mid = (min + max) / 2;

            int sum = 0;
            IntStream.of(budgets)
                .map(b ->Math.min(b, mid)) 
                .sum();
            
            if(sum <= M) {
                // 모두 더한 값이 전체 예산을 넘지 않는 경우
                // 정답으로 채택.
                min = mid + 1;
                answer = mid;
            } else {
                // 그렇지 않을 경우 범위를 좁혀 다시 이분탐색.
                max = mid - 1;
            }
        }
        return answer;
    }   
}
