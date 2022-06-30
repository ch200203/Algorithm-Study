package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Solution13 {
    public static void main(String[] args) {
        String[] record = {
            "Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"
        };
        
        System.out.println(Arrays.toString(soltion(record)));
    }

    public static String[] soltion(String[] record) {
        List<String> ans = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        for(String log : record) {
           StringTokenizer st = new StringTokenizer(log);
           String command = st.nextToken();
           String id = st.nextToken();
           String nickname = null;

           if(!command.equals("Leave")) {
            nickname = st.nextToken();           
           }

           switch(command) {
            case "Enter" : 
                map.put(id, nickname);
                ans.add(id + "님이 들어왔습니다.");
            break;
            case "Change" : 
                map.put(id, nickname);
            break;
            case "Leave" : 
                ans.add(id + "님이 나갔습니다.");
            break;
           }
        
        }

        String[] str = new String[ans.size()];
        int logIdx = 0;
        for(String log : ans) {
            int endOfId = log.indexOf("님");
            String userId = log.substring(0, endOfId);

            str[logIdx++] = log.replace(userId, map.get(userId));
        }

        return str;
    }

}
