package programmers.level2;

import java.util.*;

/**
 * 주차요금 계산
 * https://school.programmers.co.kr/learn/courses/30/lessons/92341
 */
public class Solution24 {
    static int time;
    static int defaultFee;
    static int defaultTime;
    static int unitFee;

    public static void main(String[] args) {
        int[] fees = {1439, 100000, 1439, 10000};
        
        String[] records = {
            "05:34 5961 IN"
            , "06:00 0000 IN"
            , "06:34 0000 OUT"
            , "07:59 5961 OUT"
            , "07:59 0148 IN"
            , "18:59 0000 IN"
            , "19:09 0148 OUT"
            , "22:59 5961 IN"
            , "23:00 5961 OUT"
        };

        System.out.println(Arrays.toString(solution(fees, records)));
        
    }

    public static int[] solution(int[] fees, String[] records) {
        ArrayList<Integer> answer = new ArrayList<>();
        time = fees[0];
        defaultFee = fees[1];
        defaultTime = fees[2];
        unitFee = fees[3];

        // Key = 차량 Number, value = 입장시간
        Map<String, Integer> map = new HashMap<>();
        // Key = 차량 Number, value = 주차요금
        Map<String, Integer> result = new TreeMap<>();


        // 주차 기록 처리
        for(String str : records) {
            String[] car_info = str.split(" ");
            String car_time = car_info[0];
            String car_number = car_info[1];
            String car_inout = car_info[2];

            if(car_inout.equals("OUT")) {
                int start = map.get(car_number);
                int usedTime = HourToMin(car_time) - start;

                if(result.containsKey(car_number)) {
                    int tmp = result.get(car_number);
                    usedTime += tmp;
                }

                result.put(car_number, usedTime);
                map.remove(car_number);
                continue;
            }
            map.put(car_number, HourToMin(car_time));
        }

        // 아직 안나간 차들 처리
        for(String car_number : map.keySet()) {
            int endTime = HourToMin("23:59");
            int startTime = map.get(car_number);

            int usedTime = endTime - startTime;

            if(result.containsKey(car_number)) {
                int tmp = result.get(car_number);
                usedTime += tmp;
            }

            result.put(car_number, usedTime);
            // map.remove(car_number); => 동시성 이슈 때문에 map.keySet() 과 같이 사용 불가능
        }
    

        // 자동차별 누적요금 계산
        for(String car_number : result.keySet()) {
            double usedTime = result.get(car_number);
            int resultFee = 0;

            if(usedTime > time) {
                resultFee = defaultFee + (int) Math.ceil(((usedTime - time) / defaultTime)) * unitFee;
            } else {
                resultFee = defaultFee;
            }

            answer.add(resultFee);
        }

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    } 

    public static int HourToMin(String time) {
        String[] time_arr = time.split(":");
        int hour = Integer.parseInt(time_arr[0]) * 60;
        int min = Integer.parseInt(time_arr[1]);
        return hour + min;
    }
}
