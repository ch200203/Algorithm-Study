package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution35 {

    private static Map<String, Integer> scoreMap = new HashMap<>();
    private static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        String[][] photo = {
            {"may", "kein", "kain", "radi"},
            {"may", "kein", "brin", "deny"},
            {"kon", "kain", "may", "coni"}
        };
        int[] yearning = {5, 10, 1, 3};

        int[] answer = solution(name, yearning, photo);
        System.out.println(Arrays.toString(answer));   
    }

    private static int[] solution(String[] name, int[] yearning, String[][] photo) {
        for (int i = 0; i < name.length; i++) {
            scoreMap.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for(String photoName : photo[i]) {
                if(scoreMap.get(photoName) == null) continue;
                sum += scoreMap.get(photoName);
            }

            result.add(sum);
        }

        return result.stream()
                .mapToInt(Integer::intValue).toArray();
    }
    
}
