package programmers.level2;


public class Solution15 {

    // https://school.programmers.co.kr/learn/courses/30/lessons/12911
    // 다음 큰 숫자
    public static int solution(int n) {
        // 10진법 => 2진법 변환
        String binaryN = Integer.toBinaryString(n);
        // 2진법 => 10진법 변환
        // int k = Integer.parseInt("1000", 2);
        String[] arrN = binaryN.split("");
        while(true) {
            n++;
            int cntN = 0; // 입력 받은 숫자의 1의 갯수
            int cntA = 0; // 비교할 수의 1의 갯수

            String binaryA = Integer.toBinaryString(n);
            String[] arrA = binaryA.split("");
            for (int i = 0; i < arrA.length; i++) {
                if(arrA[i].equals("1")) cntA++;
            }
            for (int i = 0; i < arrN.length; i++) {
                if(arrN[i].equals("1")) cntN++;
            }

            if(cntN == cntA) {
                return n;
            }
        }
        // => 효율성 통과 불가
    }

    // 효율성 통과 풀이
    public static int solution_2(int n) {
        // bitCount 메소드 => n을 이진수로 변환한 수의 1의 갯수를 세어 int값으로 반환
        int cntN = Integer.bitCount(n);

        int cntA = 0;

        while(true) {
            n++;
            cntA = Integer.bitCount(n);
            if(cntN == cntA) return n;
        }
    }
}
