package programmers.level1;

import java.util.ArrayList;

public class solution31 {
    public static void main(String[] args) {
        int[] ingredient //= {1, 2, 3, 1};
        // ={2, 1, 1, 2, 3, 1, 2, 3, 1};
        = {1, 3, 2, 1, 2, 3, 1, 3, 1, 2};
        System.out.println(solution_2(ingredient));

    }
    // 시간 초과
    private static int solution_2(int[] ingredient) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        if(ingredient.length < 4) return 0;
        for (int i : ingredient) sb.append(i);
    
        String str = sb.toString();
        while(str.contains("1231")) {
            str = str.replaceFirst("1231", "");
            answer++;
        }       

        return answer;
    }

    public static int solution(int[] ingredient) {
        // 1 : 빵, 2 : 야채, 3: 고기
        int answer = 0;
        ArrayList<Integer> hamList = new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();

        // 1,2,3,1 이 들어오는 경우만 햄버거를 만들 수 있음
        resultList.add(1);
        resultList.add(2);
        resultList.add(3);
        resultList.add(1);

        for (int i = 0; i < ingredient.length; i++) {
            hamList.add(ingredient[i]);

            // 4개 이상인 경우만 판단
            if(hamList.size() >= 4) {
                // 비교를 위한 임시 리스트 생성
                ArrayList<Integer> tmpList = new ArrayList<>();
                tmpList.add(hamList.get(hamList.size() - 4));
                tmpList.add(hamList.get(hamList.size() - 3));
                tmpList.add(hamList.get(hamList.size() - 2));
                tmpList.add(hamList.get(hamList.size() - 1));

                if(tmpList.equals(resultList)) {
                    answer++;
                    
                    // 햄버거가 만들어진 경우 List에서 제외
                    hamList.remove(hamList.size() - 1);
                    hamList.remove(hamList.size() - 1);
                    hamList.remove(hamList.size() - 1);
                    hamList.remove(hamList.size() - 1);
                }
            }
        }
        
        return answer;
    }

    // 배열 stack 사용한 풀이법 
    // 좋은 풀이법!
    public int solution_3(int[] ingredient) {
        int[] stack = new int[ingredient.length];
        int sp = 0;
        int answer = 0;
        for (int i : ingredient) {
            stack[sp++] = i;
            if (sp >= 4 && stack[sp - 1] == 1
                && stack[sp - 2] == 3
                && stack[sp - 3] == 2
                && stack[sp - 4] == 1) {
                sp -= 4;
                answer++;
            }
        }
        return answer;
    }
}
