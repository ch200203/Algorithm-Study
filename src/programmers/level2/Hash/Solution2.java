package programmers.level2.Hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 해시* Hash 문제 풀어보기
// 위장
// https://programmers.co.kr/learn/courses/10302/lessons/62950
public class Solution2 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        
        System.out.println(soltion(clothes));
    }
    
    public static int soltion (String[][] clothes) {
        // 경우의 수 각 종류를 곱하는 것이 기본
        //  => 경우의 수에 1을 더해서 곱해줌 => 모든 위장용품을 착용안할 경우가 있으니까 나중에 -1 을 해줌

        // 1. 종류를 저장할 Map을 생성 
        Map<String, Integer> counts = new HashMap<>(); 
        
        for (String[] c : clothes) {
            // c[0] // 용품의 이름
            String type = c[1]; // 용품의 종류
            // counts.put(type, counts.get(type) == null ? 1 : counts.get(type) + 1);
            // 각 용품별로 몇개씩 구비하고 있는 지
            counts.put(type, counts.getOrDefault(type, 0) + 1);
        }

        int answer = 1;
        for(Integer c : counts.values()) {
            answer *= c  + 1;
        }

        answer -= 1; // 모든 용품을 사용하지 않았을 경우
        


        return answer;
    }

    // 간결한 코드
    public static int soltion_1 (String[][] clothes) {
        int answer = Arrays.stream(clothes) // 모든 옷의 종류를 Stream으로 
            .map(c -> c[1])
            .distinct() // 중복제거
            .map(type -> (int) Arrays.stream(clothes).filter(c -> c[1].equals(type)).count()) // return 값이 long 이기 때문에 int로 형변환, 및 타입에 해당하는 것만 count
            .map(c -> + 1)
            .reduce(1, (c, n) -> c *n); // 타입에 대한 갯수 구하여 경우의 수를 구해줌
        

        return answer - 1; // 모두 사용 안하는 경우가 있기 때문에 -1 을 해줌
    }

}
