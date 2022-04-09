package programmers.level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// 신고결과 받기
// https://programmers.co.kr/learn/courses/30/lessons/92334
public class Solution27 {
    public static void main(String[] args) {
        
    }


    // id_list : 이용자의 ID
    // report  : 신고한 이용자의 ID
    // k       : 정지기준
    public static int[] solution(String[] id_list, String[] report, int k) {
        int [] ret = new int[id_list.length];
        Map<String, Integer> index = new HashMap<>();
        Map<String, List<Integer>> list = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            index.put(id_list[i], i);
        }

        for (String rep : report) {
            String[] ids = rep.split(" ");
            String fromId = ids[0], toId = ids[1];

            if(!list.containsKey(toId)) list.put(toId, new ArrayList<>());
            List<Integer> tmp = list.get(toId);
            if(!tmp.contains(index.get(fromId))) tmp.add(index.get(fromId));   
        }
        

        for (int i = 0; i < id_list.length; i++) {
            String id = id_list[i];
            if(list.containsKey(id) && list.get(id).size() > k){
                for(int idx : list.get(id)){
                    ret[idx] ++;
                }
            }
        }

        return ret;
    }
}
