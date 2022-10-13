import java.util.*;

class Main_3 {
    // => 맵으로 풀면 성능 구림
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
    
        solution_map(str);

        solution_arr(str);
        
        scan.close();
    }

    // 배열로 푸는 경우의 수 
    // => Map 보다 효율이 좋다.
    // 메모리 29280KB 시간 464ms
    private static void solution_arr(String str) {
        // 알파벳의 갯수
        int[] arr = new int[26];

        str = str.toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 65]++;
        }

        int max = Integer.MIN_VALUE;
        char answer = '?';

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                answer = (char) (i + 65);
            } else if(arr[i] == max) {
                answer = '?';
            }
        }

        System.out.println(answer);
    }
    // Map 으로 푸는 경우의 수 
    // => 효율이 좋지 못함
    // 메모리 47252KB 시간 560ms
    public static void solution_map(String str) {
        str = str.toUpperCase();
        
        Map<Character, Integer> map = new HashMap<>();
    
        for(Character s : str.toCharArray()) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }        
        String answer = "?";
        int max = Integer.MIN_VALUE;

        for (char x : map.keySet()) {
            if(map.get(x) > max) {
                answer = String.valueOf(x);
                max = map.get(x);
            } else if(map.get(x) == max)  {
                answer = "?";
                max = map.get(x);
            }
        }
        
        System.out.println(answer.toUpperCase());

    }
}