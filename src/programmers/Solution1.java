import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        
    }

    // https://programmers.co.kr/learn/courses/10302/lessons/62947
    // 숫자게임
    public static int solution(int[] A, int[] B){
        Arrays.sort(A);
        Arrays.sort(B);
        int index = B.length - 1;

        int answer = 0;
        // 오름차순으로 정렬되어 => loop를 거꾸로 돔
        for (int i = A.length- 1; i >= 0; i--) {
            if(A[i] < B[index]) {
                // B의 숫자가 사용된 경우
                index--;
                answer++;
            }
        }

        // for (int i = 0; i < A.length; i++) {
        //     for (int j = 0; j < B.length; j++) {
        //         if(A[i] < B[i]) {
        //             answer++;
        //             B[j] = 0; //다시 사용할 수없도록 0으로 처리함
        //             break;
        //         }
        //     }
        // } => 효율성 테스트 통과 불가능

        return answer;
    }

}
